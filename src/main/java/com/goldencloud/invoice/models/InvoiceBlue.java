package com.goldencloud.invoice.models;

import com.goldencloud.common.ApiField;

import java.util.List;

public class InvoiceBlue {

    private String sellName;

    private String sellerTaxpayerNum;

    private String sellerAddress;

    private String sellerTel;

    private String sellerBankName;

    private String sellerBankAccount;

    private int titleType;

    private String buyerTitle;

    private String buyerTaxpayerNum;

    private String buyerAddress;

    private String buyerBankName;

    private String buyerBankAccount;

    private String buyerPhone;

    private String buyerEmail;

    private String takerPhone;

    private String orderId;

    private String invoiceTypeCode;

    private String callbackUrl;

    private String drawer;

    private String payee;

    private String checker;

    private String terminalCode;

    private String userOpenid;

    private String specialInvoiceKind;

    private String zsfs;

    private int deduction;

    private int amountHasTax;

    private int taxAmount;

    private int amountWithoutTax;
    
    private String remark;
    
    private String storeNo;
    
    private int template;
    
    private InvoiceBlueYunnan info;

    private List<InvoiceBlueGoodsInfo> items;

    @ApiField(name="seller_taxpayer_num")
    public String getSellerTaxpayerNum() {
        return sellerTaxpayerNum;
    }

    public InvoiceBlue setSellerTaxpayerNum(String sellerTaxpayerNum) {
        this.sellerTaxpayerNum = sellerTaxpayerNum;
        return this;
    }

    @ApiField(name="seller_address")
    public String getSellerAddress() {
        return sellerAddress;
    }

    public InvoiceBlue setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    @ApiField(name="seller_tel")
    public String getSellerTel() {
        return sellerTel;
    }

    public InvoiceBlue setSellerTel(String sellerTel) {
        this.sellerTel = sellerTel;
        return this;
    }

    @ApiField(name="seller_bank_name")
    public String getSellerBankName() {
        return sellerBankName;
    }

    public InvoiceBlue setSellerBankName(String sellerBankName) {
        this.sellerBankName = sellerBankName;
        return this;
    }

    @ApiField(name="seller_bank_account")
    public String getSellerBankAccount() {
        return sellerBankAccount;
    }

    public InvoiceBlue setSellerBankAccount(String sellerBankAccount) {
        this.sellerBankAccount = sellerBankAccount;
        return this;
    }

    @ApiField(name="title_type")
    public int getTitleType() {
        return titleType;
    }

    public InvoiceBlue setTitleType(int titleType) {
        this.titleType = titleType;
        return this;
    }

    @ApiField(name="order_id")
    public String getOrderId() {
        return orderId;
    }

    public InvoiceBlue setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


    @ApiField(name="buyer_taxpayer_num")
    public String getBuyerTaxpayerNum() {
        return buyerTaxpayerNum;
    }

    public InvoiceBlue setBuyerTaxpayerNum(String buyerTaxCode) {
        this.buyerTaxpayerNum = buyerTaxCode;
        return this;
    }

    @ApiField(name="buyer_title")
    public String getBuyerTitle() {
        return buyerTitle;
    }

    public InvoiceBlue setBuyerTitle(String buyerTitle) {
        this.buyerTitle = buyerTitle;
        return this;
    }

    @ApiField(name="buyer_bank_name")
    public String getBuyerBankName() {
        return buyerBankName;
    }

    public InvoiceBlue setBuyerBankName(String buyerBankName) {
        this.buyerBankName = buyerBankName;
        return this;
    }

    @ApiField(name="buyer_bank_account")
    public String getBuyerBankAccount() {
        return buyerBankAccount;
    }

    public InvoiceBlue setBuyerBankAccount(String buyerBankAccount) {
        this.buyerBankAccount = buyerBankAccount;
        return this;
    }

    @ApiField(name="buyer_phone")
    public String getBuyerPhone() {
        return buyerPhone;
    }

    public InvoiceBlue setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }

    @ApiField(name="buyer_email")
    public String getBuyerEmail() {
        return buyerEmail;
    }

    public InvoiceBlue setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
        return this;
    }

    @ApiField(name="buyer_address")
    public String getBuyerAddress() {
        return buyerAddress;
    }

    public InvoiceBlue setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
        return this;
    }

    @ApiField(name="callback_url")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public InvoiceBlue setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    @ApiField(name="checker")
    public String getChecker() {
        return checker;
    }

    public InvoiceBlue setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    @ApiField(name="invoice_type_code")
    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    public InvoiceBlue setInvoiceTypeCode(String invoiceTypeCode) {
        this.invoiceTypeCode = invoiceTypeCode;
        return this;
    }

    @ApiField(name="special_invoice_kind")
    public String getSpecialInvoiceKind() {
        return specialInvoiceKind;
    }

    public InvoiceBlue setSpecialInvoiceKind(String specialInvoiceKind) {
        this.specialInvoiceKind = specialInvoiceKind;
        return this;
    }

    @ApiField(name="terminal_code")
    public String getTerminalCode() {
        return terminalCode;
    }

    public InvoiceBlue setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
        return this;
    }

    @ApiField(name="items")
    public List<InvoiceBlueGoodsInfo> getItems() {
        return items;
    }

    public InvoiceBlue setItems(List<InvoiceBlueGoodsInfo> goodsInfos) {
        this.items = goodsInfos;
        return this;
    }

    @ApiField(name="sell_name")
    public String getSellName() {
        return sellName;
    }

    public InvoiceBlue setSellName(String sellName) {
        this.sellName = sellName;
        return this;
    }

    @ApiField(name="taker_phone")
    public String getTakerPhone() {
        return takerPhone;
    }

    public InvoiceBlue setTakerPhone(String takerPhone) {
        this.takerPhone = takerPhone;
        return this;
    }

    @ApiField(name="drawer")
    public String getDrawer() {
        return drawer;
    }

    public InvoiceBlue setDrawer(String drawer) {
        this.drawer = drawer;
        return this;
    }

    @ApiField(name="payee")
    public String getPayee() {
        return payee;
    }

    public InvoiceBlue setPayee(String payee) {
        this.payee = payee;
        return this;
    }

    @ApiField(name="user_openid")
    public String getUserOpenid() {
        return userOpenid;
    }

    public InvoiceBlue setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
        return this;
    }

    @ApiField(name="zsfs")
    public String getZsfs() {
        return zsfs;
    }

    public InvoiceBlue setZsfs(String zsfs) {
        this.zsfs = zsfs;
        return this;
    }

    @ApiField(name="deduction")
    public int getDeduction() {
        return deduction;
    }

    public InvoiceBlue setDeduction(int deduction) {
        this.deduction = deduction;
        return this;
    }

    @ApiField(name="amount_has_tax")
    public int getAmountHasTax() {
        return amountHasTax;
    }

    public InvoiceBlue setAmountHasTax(int amountHasTax) {
        this.amountHasTax = amountHasTax;
        return this;
    }

    @ApiField(name="tax_amount")
    public int getTaxAmount() {
        return taxAmount;
    }

    public InvoiceBlue setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    @ApiField(name="amount_without_tax")
    public int getAmountWithoutTax() {
        return amountWithoutTax;
    }

    public InvoiceBlue setAmountWithoutTax(int amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
        return this;
    }

    @ApiField(name="remark")
    public String getRemark() {
        return remark;
    }

    public InvoiceBlue setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @ApiField(name="store_no")
    public String getStoreNo() {
        return storeNo;
    }

    public InvoiceBlue setStoreNo(String storeNo) {
        this.storeNo = storeNo;
        return this;
    }

    @ApiField(name="template")
    public int getTemplate() {
        return template;
    }

    public InvoiceBlue setTemplate(int template) {
        this.template = template;
        return this;
    }

    @ApiField(name="info")
    public InvoiceBlueYunnan getInfo() {
        return info;
    }

    public InvoiceBlue setInfo(InvoiceBlueYunnan info) {
        this.info = info;
        return this;
    }
}
