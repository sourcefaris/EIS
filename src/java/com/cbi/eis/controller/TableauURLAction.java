package com.cbi.eis.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.service.TableauService;
import com.opensymphony.xwork2.ActionContext;

public class TableauURLAction extends DefaultAction{
	private String url ;
	
	public String execute(){
		try {
			url = "http://"+get("tableau.server.host")+"/#/views/"+getCurrDescriptorUrl()+"?"+get("tableau.params");
			/*
			 * URl to show a view with trusted ticket
			 */
//			url = TableauService.getSourceViewURL(getRemoteAddress(), get("tableau.server.host"), getCurrentUser().getUsername(), getCurrDescriptorUrl(), get("tableau.params"));
			getResponse().sendRedirect(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public HttpServletResponse getResponse() {
		return (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}
	
	public String getUrl() {
		return url;
	}

}
