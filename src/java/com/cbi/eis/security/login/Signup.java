package com.cbi.eis.security.login;

import com.cbi.eis.entity.User;
import com.cbi.eis.security.UserAccessor;
import com.cbi.eis.security.UserAccessorAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Signup extends ActionSupport implements ModelDriven, UserAccessorAware {
    private User user = new User();
    private String verifyPassword;
    private UserAccessor ua;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public Object getModel() {
        return user;
    }

    public void setUserAccessor(UserAccessor ua) {
        this.ua = ua;
    }

    public String execute() {
        if (ua.getByUsername(user.getUsername()) == null) {
            ua.signup(user);
            return SUCCESS;
        } else {
            addFieldError("username", "Username is already taken, please choose another");
            return ERROR;
        }
    }
}
