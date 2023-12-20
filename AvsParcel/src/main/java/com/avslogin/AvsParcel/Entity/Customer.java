package com.avslogin.AvsParcel.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Table(name="tbl_customer")
public class Customer {
    @Id
    @GeneratedValue

    private long CustomerId;

    private String CompanyName;
    private  String CustomerName;
    private int WhatsappNo;
    private int PhoneNo;
    private  String Gender;
    private int Age;
    private String Address;
    private int GSTNo;
    private int PANNo;
    private  String email;
    private Boolean IsActive;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }


    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getWhatsappNo() {
        return WhatsappNo;
    }

    public void setWhatsappNo(int whatsappNo) {
        WhatsappNo = whatsappNo;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getGSTNo() {
        return GSTNo;
    }

    public void setGSTNo(int GSTNo) {
        this.GSTNo = GSTNo;
    }

    public int getPANNo() {
        return PANNo;
    }

    public void setPANNo(int PANNo) {
        this.PANNo = PANNo;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }


    private int getNextId() {
        // Implement your custom logic to get the next sequential number
        // You can fetch the maximum ID from the database or use any other logic
        // For simplicity, let's assume a constant increment here
        int maxId = 100; // Retrieve the maximum ID from the database or any other source
        return maxId + 1;
    }

}
