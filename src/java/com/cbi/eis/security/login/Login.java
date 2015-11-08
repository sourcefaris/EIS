package com.cbi.eis.security.login;

import java.util.List;

import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.security.UserAccessorAware;
import com.cbi.eis.service.TableauRestAPIService;
import com.cbi.eis.service.TableauService;
import com.opensymphony.xwork2.ActionContext;

import tableau.api.rest.bindings.TableauCredentialsType;
import tableau.api.rest.bindings.TsResponse;
import tableau.api.rest.bindings.WorkbookType;

public class Login extends LoginForm implements UserAccessorAware {
    
    public String execute() {
    	if (ua.authenticate(getUsername(), getPassword())) {
    		setUser(ua.getByUsername(getUsername()));
    		if(getUser().getRole().getName().equalsIgnoreCase("default")){
    			addFieldError("username", "Sorry, your account not activated yet.");
    			return INPUT;
    		} else {
    			ActionContext.getContext().getSession().put(LoginFilter.LOGIN_GA_USER, su.encodeBase64(getUser().getId()));
	            TsResponse signIn = TableauService.getSignInResponse();
	            ActionContext.getContext().getSession().put(LoginFilter.LOGIN_TABLEAU_CREDENTIALS, signIn.getCredentials());
	            List<WorkbookType> workbooks = TableauService.getResponseQueryWorkbooks(200, 1).getWorkbooks().getWorkbook();
	            if(workbooks==null){
	            	return INPUT;
	            }
	            ActionContext.getContext().getSession().put(LoginFilter.TABLEAU_WORKBOOKS, workbooks);
	            return SUCCESS;
    		}
        } else {
            addFieldError("username", "Invalid username or password.");
            return INPUT;
        }
    }

    
}