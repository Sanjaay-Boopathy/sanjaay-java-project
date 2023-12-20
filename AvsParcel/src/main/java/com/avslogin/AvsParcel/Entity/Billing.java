package com.avslogin.AvsParcel.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tblbilling")
public class Billing {
    @Id
    @GeneratedValue
    @Column(name = "Billing_id")
    private Long billingId;
    private  String CustomerName;
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
    @Column(name = "payment_type")
    private String paymentType;


    public Billing(Long billingId, String customerName, String toCustomer, String fromAddress, String toAddress, int mobileNO, int toMobileNO, String email, String GSTNo, int noOfPackage,
                   int materialValue, int weight, String paymentType, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.billingId = billingId;
        CustomerName = customerName;
        ToCustomer = toCustomer;
        FromAddress = fromAddress;
        ToAddress = toAddress;
        MobileNO = mobileNO;
        ToMobileNO = toMobileNO;
        this.email = email;
        this.GSTNo = GSTNo;
        NoOfPackage = noOfPackage;
        MaterialValue = materialValue;
        this.weight = weight;
        this.paymentType = paymentType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedAt;

    public Long getBillingId() {
        return billingId;
    }

    public void setBillingId(Long billingId) {
        this.billingId = billingId;
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Billing()
{

}
    @PrePersist
    public void onSave(){
        // create at and update at
        LocalDateTime currentDateTime =  LocalDateTime.now();

        this.createdAt = currentDateTime;
        this.updatedAt = currentDateTime;
    }

    @PostPersist
    public void onUpdate(){
        // update at
        LocalDateTime currentDateTime =  LocalDateTime.now();

        this.updatedAt = currentDateTime;
    }


}
