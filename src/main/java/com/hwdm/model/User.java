package com.hwdm.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@MappedSuperclass
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    @NotEmpty
    private String userID;

    @Column(name = "user_pwd")
    @NotEmpty
    private String userPwd;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
