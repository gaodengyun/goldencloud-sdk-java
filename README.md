使用方法
===============================
支持JDK >= 1.7

获取安装:
```说明：
1.前往 Github 代码托管地址 下载源码压缩包。
2.解压源码包到您项目合适的位置。
3.将examples目录放到maven管理目录（/src/main/java）下，运行示例
4.引用方法可参下面的示例。
```

- 快速开具蓝票

```java
package examples;

import Sdk;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class example{
    
    public static void main(String []args){
        try {
            Sdk sdk = new Sdk("fc1234561483b2db498", "a1c1234c5af678bc42d322a7gtrty4565", "1.0.0", "test");
            InvoiceBlue blue = new InvoiceBlue();
            blue.setSellName("JACK测试企业12");
            blue.setSellerTaxpayerNum("911101076819661132");
            blue.setSellerAddress("");
            blue.setSellerTel("");
            blue.setSellerBankName("");
            blue.setSellerBankAccount("");
            blue.setTitleType(1);
            blue.setBuyerTitle("海南高灯科技");
            blue.setBuyerTaxpayerNum("");
            blue.setBuyerAddress("");
            blue.setBuyerBankAccount("");
            blue.setBuyerBankName("");
            blue.setBuyerPhone("");
            blue.setBuyerEmail("");
            blue.setTakerPhone("");
            blue.setOrderId("4651321213312");
            blue.setInvoiceTypeCode("032");
            blue.setCallbackUrl("https://www.baidu.com/xxs/callback");
            blue.setDrawer("lx");
            blue.setPayee("收到否");
            blue.setChecker("jack");
            blue.setUserOpenid("41345");
            blue.setSpecialInvoiceKind("");
            blue.setTerminalCode("");
            blue.setAmountHasTax(9508);
            blue.setTaxAmount(864);
            blue.setAmountWithoutTax(8644);
            blue.setRemark("sdd");
    
            InvoiceBlueGoodsInfo item = new InvoiceBlueGoodsInfo();
            item.setName("海鲜真划算");
            item.setTaxCode("1010499000000000000");
            item.setTaxType("");
            item.setModels("xyz");
            item.setUnit("个");
            item.setTotalPrice(8644);
            item.setTotal("5");
            item.setPrice("17.288");
            item.setTaxRate(100);
            item.setTaxAmount(864);
            item.setDiscount(0);
            item.setZeroTaxFlag("");
            item.setPreferentialPolicyFlag("");
            item.setVatSpecialManagement("");
    
            ArrayList<InvoiceBlueGoodsInfo> goodsInfos = new ArrayList<InvoiceBlueGoodsInfo>();
            goodsInfos.add(item);
            blue.setItems(goodsInfos);

            JSONObject result = sdk.invoiceBlue(blue);
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

- 快速开具红票

```java
package examples;

import Sdk;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class example{
    
    public static void main(String []args){
        try {
            Sdk sdk = new Sdk("fc1234561483b2db498", "a1c1234c5af678bc42d322a7gtrty4565", "1.0.0", "test");
           InvoiceRed red = new InvoiceRed();
           
           ArrayList<InvoiceRedInvoice> invoices = new ArrayList<InvoiceRedInvoice>();
           InvoiceRedInvoice invoice = new InvoiceRedInvoice();
           invoice.setSellerTaxpayerNum("911101076819661132");//销方税号
           invoice.setCallbackUrl("回掉地址");//销方税号
           invoice.setOrderSn("6645588687037969410");//销方税号
           invoices.add(invoice);
   
           red.setInvoices(invoices);
           JSONObject result = sdk.invoiceRed(red);
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
