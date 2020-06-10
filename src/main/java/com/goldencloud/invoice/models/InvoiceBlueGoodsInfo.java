package com.goldencloud.invoice.models;

import com.goldencloud.common.ApiField;

public class InvoiceBlueGoodsInfo {

    private String name;

    private String taxCode;

    private String taxType;

    private String models;

    private String unit;

    private int totalPrice;

    private String total;

    private String price;

    private int taxRate;

    private int taxAmount;

    private String zeroTaxFlag;

    private String preferentialPolicyFlag;
    
    private String vatSpecialManagement;

    private int discount;

    @ApiField(name="name")
    public String getName() {
        return name;
    }

    public InvoiceBlueGoodsInfo setName(String name) {
        this.name = name;
        return this;
    }

    @ApiField(name="tax_code")
    public String getTaxCode() {
        return taxCode;
    }

    public InvoiceBlueGoodsInfo setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    @ApiField(name="tax_type")
    public String getTaxType() {
        return taxType;
    }

    public InvoiceBlueGoodsInfo setTaxType(String taxType) {
        this.taxType = taxType;
        return this;
    }

    @ApiField(name="models")
    public String getModels() {
        return models;
    }

    public InvoiceBlueGoodsInfo setModels(String models) {
        this.models = models;
        return this;
    }

    @ApiField(name="unit")
    public String getUnit() {
        return unit;
    }

    public InvoiceBlueGoodsInfo setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @ApiField(name="total_price")
    public int getTotalPrice() {
        return totalPrice;
    }

    public InvoiceBlueGoodsInfo setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    @ApiField(name="total")
    public String getTotal() {
        return total;
    }

    public InvoiceBlueGoodsInfo setTotal(String total) {
        this.total = total;
        return this;
    }

    @ApiField(name="price")
    public String getPrice() {
        return price;
    }

    public InvoiceBlueGoodsInfo setPrice(String price) {
        this.price = price;
        return this;
    }

    @ApiField(name="tax_rate")
    public int getTaxRate() {
        return taxRate;
    }

    public InvoiceBlueGoodsInfo setTaxRate(int taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    @ApiField(name="tax_amount")
    public int getTaxAmount() {
        return taxAmount;
    }

    public InvoiceBlueGoodsInfo setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    @ApiField(name="discount")
    public int getDiscount() {
        return discount;
    }

    public InvoiceBlueGoodsInfo setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    @ApiField(name="zero_tax_flag")
    public String getZeroTaxFlag() {
        return zeroTaxFlag;
    }

    public InvoiceBlueGoodsInfo setZeroTaxFlag(String zeroTaxFlag) {
        this.zeroTaxFlag = zeroTaxFlag;
        return this;
    }

    @ApiField(name="preferential_policy_flag")
	public String getPreferentialPolicyFlag() {
		return preferentialPolicyFlag;
	}

	public InvoiceBlueGoodsInfo setPreferentialPolicyFlag(String preferentialPolicyFlag) {
		this.preferentialPolicyFlag = preferentialPolicyFlag;
		return this;
	}
	
    @ApiField(name="vat_special_management")
	public String getVatSpecialManagement() {
		return vatSpecialManagement;
	}

	public InvoiceBlueGoodsInfo setVatSpecialManagement(String vatSpecialManagement) {
		this.vatSpecialManagement = vatSpecialManagement;
		return this;
	}
}
