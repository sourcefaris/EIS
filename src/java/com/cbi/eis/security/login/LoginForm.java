package com.cbi.eis.security.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.Role;
import com.cbi.eis.entity.User;
import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.security.UserAccessor;
import com.cbi.eis.security.UserAccessorAware;
import com.cbi.eis.util.StringUtils;
import com.opensymphony.xwork2.ActionContext;

public class LoginForm extends DefaultAction implements UserAccessorAware {
	protected UserAccessor ua;
	protected StringUtils su = new StringUtils();
	private String username = "";
	private String password = "";
	private User user = new User();
	private Role role = new Role();
	private List<User> users = new ArrayList<User>();
	private String redirectUri;

	public String execute() {
    	if(getRedirectUri()!=null&&!"".equalsIgnoreCase(getRedirectUri().trim())){
    		try {
				getResponse().sendRedirect("../../");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
		if (ActionContext.getContext().getSession().get(
				LoginFilter.LOGIN_GA_USER) != null) { // sudah login
			
			getUser().setId(su.decodeBase64(ActionContext.getContext().getSession().get(LoginFilter.LOGIN_GA_USER).toString()));
			setUser(ua.getById(getUser().getId()));
			if(getUser().getRole().getId().equals("3"))
				return "viewPage";
			else
				return "continue";
		} else { // belum login 
			return "login";
		}
	}

	public void setUserAccessor(UserAccessor ua) {
		this.ua = ua;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StringUtils getSu() {
		return su;
	}

	public void setSu(StringUtils su) {
		this.su = su;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
    public HttpServletResponse getResponse() {
		return (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}
	
	
}
