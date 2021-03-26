package com.goldencloud.common;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class Util {

    public static String md5(String src) {
        String md5str = "";
        try {
            MessageDigest md    = MessageDigest.getInstance("MD5");
            byte[]        input = src.getBytes();
            byte[]        buff  = md.digest(input);
            md5str = ToHex(buff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    private static String ToHex(byte[] arr) {
        StringBuilder md5str = new StringBuilder();
        int           digital;
        for (byte anArr : arr) {
            digital = anArr;
            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return md5str.toString().toLowerCase();
    }

    /**
     * sha256_HMAC加密
     * @param message 消息
     * @param secret  秘钥
     * @return 加密后字符串
     */
    public static String sha256_HMAC(String message, String secret) {
        String result = "";
        try
        {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte[] bytes = sha256_HMAC.doFinal(message.getBytes("utf-8"));
            result = DatatypeConverter.printBase64Binary(bytes);
        } catch (Exception e)
        {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
        }
        return result;
    }
}
