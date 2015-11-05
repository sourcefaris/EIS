package com.cbi.eis;

import java.io.IOException;
import java.util.Properties;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.URLBean;

import com.cbi.eis.entity.Role;
import com.cbi.eis.entity.User;
import com.cbi.eis.persistence.PersistenceAware;
import com.cbi.eis.persistence.PersistenceManager;
import com.cbi.eis.security.SessionCredentials;
import com.cbi.eis.security.SessionCredentialsAware;
import com.cbi.eis.util.PropertyLooker;
import com.opensymphony.xwork2.ActionSupport;


public class DefaultAction extends ActionSupport implements PersistenceAware, SessionCredentialsAware {
	protected PersistenceManager persistence;
	private static SessionCredentials sessionCredentials;
	private String currDescriptor;
	protected boolean error;
	private String actionText = ".action";
	private String queryStatus ;
	
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(PropertyLooker.getResourceAsStream("conf.properties"));
		} catch (IOException e){
			e.printStackTrace();
		} catch (NullPointerException npe) {
			LOG.info("file conf.properties is not in classpath");
			npe.printStackTrace();
		}
	}
	public static String getCurrDescriptorUrl(){
		URLBean bean = new URLBean();
		bean.setRequest(ServletActionContext.getRequest());
		bean.setResponse(ServletActionContext.getResponse());
		String target = ServletActionContext.getResponse().encodeRedirectURL(bean.toString());
		
		String descriptorCandidate[] = target.split("/");
		String descriptorName = descriptorCandidate[3]+"/"+descriptorCandidate[4];
		return descriptorName.replace(".action", "");
	}
	public static String get(String propertyName){
		return properties.getProperty(propertyName);
	}
	
	public void setPersistenceManager(PersistenceManager persistenceManager) {
		this.persistence = persistenceManager;
	}
	public void setSessionCredentials(SessionCredentials sessionCredentials) {
		this.sessionCredentials = sessionCredentials;
	}
	
	public static User getCurrentUser(){
		return sessionCredentials.getCurrentUser();
	}
	public Role getCurrentRole(){
		return getCurrentUser().getRole();
	}
	public String getCurrDescriptor() {
		return currDescriptor;
	}
	public void setCurrDescriptor(String currDescriptor) {
		this.currDescriptor = currDescriptor;
	}
	public String getRemoteAddress(){
		return ServletActionContext.getRequest().getRemoteAddr();
	}
	
	public boolean isError() {
		return error;
	}
	
	public void setError(boolean error) {
		this.error = error;
	}
	
	public String getActionText() {
		return actionText;
	}
	
	public String getQueryStatus() {
		return queryStatus;
	}
	
	public void setQueryStatus(String queryStatus) {
		this.queryStatus = queryStatus;
	}
}
