package com.goldencloud.common;

import com.goldencloud.invoice.models.InvoiceBlue;
import com.goldencloud.invoice.models.InvoiceRed;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Sdk {

    public static final String EQUAL = "=";
    public static final String AND = "&";

    private String env;
    private String appkey;
    private String appsecret;
    private String baseUrl;
    private String ver;

    public Sdk(String appkey, String appSecret, String env)
    {
        this.env = env;
        this.appkey = appkey;
        this.appsecret = appSecret;
        this.ver = "1.0.0";   
    }
     
    public Sdk(String appkey,String appSecret,String env,String ver)
    {
        this(appkey, appSecret, env);
        this.ver=ver;
    }

    public String getEnv() {
        return env;
    }

    public Sdk setEnv(String env){
        this.env = env;
        return this;
    }
    
    public void setBaseUrl(String url) {
    	this.baseUrl = url; 
    }

    public String getBaseUrl() {
    	if(this.baseUrl!=null) {
    		return this.baseUrl;
    	}
    	if( this.env.equals("test" )){
    		return  EnvEnum.URL.TEST.getUrl();
        }else{
        	return  EnvEnum.URL.PROD.getUrl();
        }
    }

    public JSONObject invoiceBlue(InvoiceBlue invoiceBlue) throws RuntimeException,IOException,IllegalAccessException, InvocationTargetException
    {
        //步骤1 生成签名串
        //*

        //步骤2 生成的签名请求字符串。把排序好的 公共参数 格式化成 参数名称=参数值 的形式，加上signature=[步骤1] 中的签名串，用 "," (英文半角逗号) 拼接在一起。
        //形如:algorithm=签名算法,appkey=应用ID,nonce=随机数字,timestamp=时间戳,signature=签名串

        //步骤3 把[步骤2]中生成的签名请求字符串，放在 Authorization字段中，通过 Http header 方法，向服务器发起请求。
        //*

        String url = "/tax-api/invoice/blue/v1";
        JSONObject data = JSONObject.fromObject(invoiceBlue);//将java对象转换为json对象
        String postData = data.toString();//将json对象转换为字符串

        TreeMap<String, String> publicParams = GetPublicParamDic();//TreeMap的Key有序
        String sign = generateSign(url, publicParams, data);

        String publicString = JointPublicParamString(publicParams,",");

        String requestSignString = publicString+"signature="+sign;
        String postUrl = this.getBaseUrl()+url;

        System.out.println("请求地址："+postUrl);
        System.out.println("待签名串："+postData);
        System.out.println("请求头："+requestSignString);
        return this.httpPost(postUrl, postData,requestSignString);
    }

    public JSONObject invoiceRed(InvoiceRed invoiceRed) throws RuntimeException,IOException,IllegalAccessException, InvocationTargetException
    {
        //步骤1 生成签名串
        //*

        //步骤2 生成的签名请求字符串。把排序好的 公共参数 格式化成 参数名称=参数值 的形式，加上signature=[步骤1] 中的签名串，用 "," (英文半角逗号) 拼接在一起。
        //形如:algorithm=签名算法,appkey=应用ID,nonce=随机数字,timestamp=时间戳,signature=签名串

        //步骤3 把[步骤2]中生成的签名请求字符串，放在 Authorization字段中，通过 Http header 方法，向服务器发起请求。
        //*

        String url = "/tax-api/invoice/red/v1";
        String postUrl = this.getBaseUrl()+url;
        JSONObject data = JSONObject.fromObject(invoiceRed);//将java对象转换为json对象
        String postData = data.toString();//将json对象转换为字符串

        TreeMap<String, String> publicParams = GetPublicParamDic();//TreeMap的Key有序
        String sign = generateSign(url, publicParams, data);//签名

        String publicString = JointPublicParamString(publicParams,",");
        String requestSignString = publicString+"signature="+sign;//签名请求字符串

        return this.httpPost(postUrl, postData,requestSignString);
    }

    /// <summary>
    /// 生成签名
    /// </summary>
    /// <param name="url"></param>
    /// <param name="publicParams"></param>
    /// <param name="data"></param>
    /// <returns></returns>
    private String generateSign(String url,TreeMap<String, String> publicParams,JSONObject data)
    {
        //步骤1 对公共参数按参数名的字典序（ ASCII 码）升序排序
        //*

        //步骤2 把[步骤1]中排序好的 公共参数 格式化成 参数名称=参数值（key = value） 的形式，格式化后的各个参数用"|"拼接在一起,然后再拼接 URL路径、业务参数 payload
        //形如：algorithm=签名算法|appkey=应用ID|nonce=随机数字|timestamp=时间戳|URL路径|业务参数payload
        //例如：algorithm=HMAC-SHA256|appkey=gd_abcdefghijklmn|nonce=398888|timestamp=1590719810|/invoice/v1|{"name":"高灯云"}

        //步骤3 使用 HMAC-SHA256 或 RSA-SHA256 算法对[步骤2]中获得的签名原文字符串进行签名，然后将生成的签名串使用 Base64 进行编码，即可获得最终的签名串
        //*

        String publicString = JointPublicParamString(publicParams,"|");
        String payload = data.toString();//将json对象转换为字符串;
        String originStr = publicString+url+"|"+payload;

        return Util.sha256_HMAC(originStr,this.appsecret);
    }

    /// <summary>
    /// 公共参数放在TreeMap中，TreeMap的key默认按升序排列
    /// </summary>
    /// <returns></returns>
    private TreeMap<String, String> GetPublicParamDic()
    {
        Long timestamp = System.currentTimeMillis() / 1000;
        String randomNum = GetRandomNum();

        TreeMap<String, String> result = new TreeMap<String, String>();
        result.put("algorithm", "HMAC-SHA256");
        result.put("appkey", this.appkey);
        result.put("nonce", randomNum);
        result.put("timestamp", timestamp.toString());

        return result;
    }

    /// <summary>
    /// 生成6位随机数
    /// </summary>
    /// <returns></returns>
    private String GetRandomNum()
    {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

    /// <summary>
    /// 拼接字符串，保留最后一个delimiter
    /// </summary>
    /// <returns></returns>
    private String JointPublicParamString(TreeMap<String, String> publicParams,String delimiter)
    {
        StringBuilder str = new StringBuilder();
        Set<String> set = publicParams.keySet();
        for (String key : set) {
            String value = publicParams.get(key);
            str.append(key+"="+value+delimiter);
        }
        return str.toString();
    }

    public JSONObject httpPost(String requestUrl, String body,String authorization) throws RuntimeException,IOException
    {
        JSONObject response = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(requestUrl);// 创建httpPost
        httpPost.setHeader( "Accept", "application/json" );
        httpPost.setHeader( "Content-Type", "application/json" );
        httpPost.setHeader("Authorization",authorization);
        String charSet = "UTF-8";
        StringEntity entity = new StringEntity(body, charSet );
        httpPost.setEntity( entity );
        try {
            HttpResponse res = httpclient.execute( httpPost );
            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                String result = EntityUtils.toString(res.getEntity(), "utf-8");
                response = JSONObject.fromObject(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            httpclient.close();
        }
        return response;
    }

}
