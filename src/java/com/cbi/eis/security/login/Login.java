package com.cbi.eis.security.login;

import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.security.UserAccessorAware;
import com.cbi.eis.service.TableauRestAPIService;
import com.cbi.eis.service.TableauService;
import com.opensymphony.xwork2.ActionContext;

public class Login extends LoginForm implements UserAccessorAware {
    
    public String execute() {
    	if (ua.authenticate(getUsername(), getPassword())) {
    		setUser(ua.getByUsername(getUsername()));
    		if(getUser().getRole().getName().equalsIgnoreCase("default")){
    			addFieldError("username", "Sorry, your account not activated yet.");
    			return INPUT;
    		} else {
	            ActionContext.getContext().getSession().put(LoginFilter.LOGIN_GA_USER, su.encodeBase64(getUser().getId()));
	            ActionContext.getContext().getSession().put(LoginFilter.LOGIN_TABLEAU_CREDENTIALS, TableauService.getSignInResponse().getCredentials());
	            ActionContext.getContext().getSession().put(LoginFilter.TABLEAU_WORKBOOKS, TableauService.getResponseQueryWorkbooks(200, 1).getWorkbooks().getWorkbook());
	            return SUCCESS;
    		}
        } else {
            addFieldError("username", "Invalid username or password.");
            return INPUT;
        }
    }

    
}