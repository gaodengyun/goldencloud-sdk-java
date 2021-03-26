package com.goldencloud.invoice;

import com.goldencloud.common.Sdk;
import com.goldencloud.invoice.models.InvoiceBlue;
import com.goldencloud.invoice.models.InvoiceBlueGoodsInfo;
import com.goldencloud.invoice.models.InvoiceRed;
import com.goldencloud.invoice.models.InvoiceRedInvoice;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class InvoiceApi {
    /**
     * 发票冲红
     */
    public static JSONObject invoiceRed(Sdk sdk) throws RuntimeException, IOException,IllegalAccessException, InvocationTargetException {
        InvoiceRed red = new InvoiceRed();

        ArrayList<InvoiceRedInvoice> invoices = new ArrayList<InvoiceRedInvoice>();
        InvoiceRedInvoice invoice = new InvoiceRedInvoice();
        invoice.setSellerTaxpayerNum("911101076819661132");//销方税号
        invoice.setCallbackUrl("回掉地址");//销方税号
        invoice.setOrderSn("6645588687037969410");//销方税号
        invoices.add(invoice);

        red.setInvoices(invoices);
        JSONObject result = sdk.invoiceRed(red);
        return result;
    }

    /**
     * 发票开具
     */
    public static JSONObject invoiceBlue(Sdk sdk) throws RuntimeException,IOException,IllegalAccessException, InvocationTargetException {
        InvoiceBlue blue = new InvoiceBlue();
        blue.setSellerName("JACK测试企业12");
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
        blue.setAmountHasTax("95.08");
        blue.setTaxAmount("8.64");
        blue.setAmountWithoutTax("86.44");
        blue.setRemark("sdd");

        InvoiceBlueGoodsInfo item = new InvoiceBlueGoodsInfo();
        item.setName("海鲜真划算");
        item.setTaxCode("1010499000000000000");
        item.setTaxType("");
        item.setModels("xyz");
        item.setUnit("个");
        item.setTotalPrice("86.44");
        item.setTotal("5");
        item.setPrice("17.288");
        item.setTaxRate("0.03");
        item.setTaxAmount("8.64");
        item.setDiscount("-20.88");
        item.setZeroTaxFlag("");
        item.setPreferentialPolicyFlag("");
        item.setVatSpecialManagement("");

        ArrayList<InvoiceBlueGoodsInfo> goodsInfos = new ArrayList<InvoiceBlueGoodsInfo>();
        goodsInfos.add(item);
        // goodsInfos.add(item);
        blue.setItems(goodsInfos);
        JSONObject result = sdk.invoiceBlue(blue);
        return result;
    }
}
