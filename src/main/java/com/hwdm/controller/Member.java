package com.hwdm.controller;

import com.hwdm.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Member extends User{

    @Column(name = "company")
    private String company;

    @Column(name = "department")
    private String department;

    @Column(name = "extenstion")
    private String extension;

    @Column(name = "telephone")
    private String telephone;

    // For Superclass
    public String getMemberID() {
        return this.getUserID();
    }

    // For Superclass
    public void setMemberID(String memberID) {
       this.setUserID(memberID);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
