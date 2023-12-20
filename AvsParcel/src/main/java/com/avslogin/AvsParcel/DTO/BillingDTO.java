package com.avslogin.AvsParcel.DTO;

public class BillingDTO {
    private Long Billing_id;
    private String CustomerName;
    private String ToCustomer;
    private String FromAddress;
    private  String ToAddress;
    private int MobileNO;
    private  int ToMobileNO;
    private  String email;
    private  String GSTNo;
    private  int NoOfPackage;
    private  int MaterialValue;
    private  int 	weight;

    private  String PaymentType;

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public Long getBilling_id() {
        return Billing_id;
    }

    public void setBilling_id(Long billing_id) {
        Billing_id = billing_id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getToCustomer() {
        return ToCustomer;
    }

    public void setToCustomer(String toCustomer) {
        ToCustomer = toCustomer;
    }

    public String getFromAddress() {
        return FromAddress;
    }

    public void setFromAddress(String fromAddress) {
        FromAddress = fromAddress;
    }

    public String getToAddress() {
        return ToAddress;
    }

    public void setToAddress(String toAddress) {
        ToAddress = toAddress;
    }

    public int getMobileNO() {
        return MobileNO;
    }

    public void setMobileNO(int mobileNO) {
        MobileNO = mobileNO;
    }

    public int getToMobileNO() {
        return ToMobileNO;
    }

    public void setToMobileNO(int toMobileNO) {
        ToMobileNO = toMobileNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGSTNo() {
        return GSTNo;
    }

    public void setGSTNo(String GSTNo) {
        this.GSTNo = GSTNo;
    }

    public int getNoOfPackage() {
        return NoOfPackage;
    }

    public void setNoOfPackage(int noOfPackage) {
        NoOfPackage = noOfPackage;
    }

    public int getMaterialValue() {
        return MaterialValue;
    }

    public void setMaterialValue(int materialValue) {
        MaterialValue = materialValue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



}
