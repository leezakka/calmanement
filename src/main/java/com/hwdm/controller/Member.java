package com.hwdm.controller;

import com.hwdm.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "members")
@Component
public class Member extends User{

    private String company;
    private String department;
    private String extension;
    private String telephone;

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
