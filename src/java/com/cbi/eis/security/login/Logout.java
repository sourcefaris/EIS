package com.cbi.eis.security.login;

import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.service.TableauService;
import com.opensymphony.xwork2.ActionContext;

public class Logout extends LoginForm {

    public String execute() {
        ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_GA_USER);
        TableauService.signOut();
        ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_TABLEAU_CREDENTIALS);
        return SUCCESS;
    }

}
