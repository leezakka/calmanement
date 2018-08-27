package com.hwdm.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

//@MappedSupeclass
@Component
public class User extends BaseEntry {

    //@Column(name = "user_id")
    @NotEmpty
    private String userID;

    //@Column(name = "user_pwd")
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
