package com.avslogin.AvsParcel.DTO;

public class CustomerDTO {

    private String CompanyName;
    private  String CustomerName;
    private int WhatsappNo;
    private int PhoneNo;
    private  String Gender;
    private int Age;
    private String Address;
    private int GSTNo;
    private int PANNo;
    private Boolean IsActive;
    private  String email;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


}
