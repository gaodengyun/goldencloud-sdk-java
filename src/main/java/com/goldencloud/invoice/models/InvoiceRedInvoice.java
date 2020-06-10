package com.goldencloud.invoice.models;

import com.goldencloud.common.ApiField;

public class InvoiceRedInvoice {

    private String  sellerTaxpayerNum;

    private String callbackUrl;

    private String orderSn;

    private String orderId;

    private String redSerialNo;

    @ApiField(name="seller_taxpayer_num")
    public String getSellerTaxpayerNum() {
        return sellerTaxpayerNum;
    }

    public InvoiceRedInvoice setSellerTaxpayerNum(String sellerTaxpayerNum) {
        this.sellerTaxpayerNum = sellerTaxpayerNum;
        return this;
    }

    @ApiField(name="callback_url")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public InvoiceRedInvoice setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    @ApiField(name="order_sn")
    public String getOrderSn() {
        return orderSn;
    }

    public InvoiceRedInvoice setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    @ApiField(name="order_id")
    public String getOrderId() {
        return orderId;
    }

    public InvoiceRedInvoice setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @ApiField(name="red_serial_no")
    public String getRedSerialNo() {
        return redSerialNo;
    }

    public InvoiceRedInvoice setRedSerialNo(String redSerialNo) {
        this.redSerialNo = redSerialNo;
        return this;
    }
}
