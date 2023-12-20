package com.avslogin.AvsParcel.Entity;

import com.avslogin.AvsParcel.Comman.Constant;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private String gender;

    private String email;
    private String phoneNumber;
    private String userType= Constant.USER_TYPE.NORMAL;
    private String password;
    private  boolean isActive =true;
    private Integer loginCount=0;
    private String ssoTpe;
    private LocalDateTime loginAt;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getSsoTpe() {
        return ssoTpe;
    }

    public void setSsoTpe(String ssoTpe) {
        this.ssoTpe = ssoTpe;
    }

    public LocalDateTime getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(LocalDateTime loginAt) {
        this.loginAt = loginAt;
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

    public User() {

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
