package com.cbi.eis.security.login;

import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.service.TableauRestAPIService;
import com.opensymphony.xwork2.ActionContext;

import tableau.api.rest.bindings.TableauCredentialsType;

public class Logout extends LoginForm {

    public String execute() {
        ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_GA_USER);
        ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_TABLEAU_CREDENTIALS);
        return SUCCESS;
    }

}
