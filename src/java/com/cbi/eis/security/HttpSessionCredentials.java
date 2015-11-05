package com.cbi.eis.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.cbi.eis.entity.User;
import com.cbi.eis.util.StringUtils;

public class HttpSessionCredentials implements SessionCredentials,
		UserAccessorAware {

	private UserAccessor userAccessor;

	public void setUserAccessor(UserAccessor userAccessor) {
		this.userAccessor = userAccessor;
	}

	public User getCurrentUser() {
		StringUtils stringUtils = new StringUtils();

		String userId = "";

		if (ServletActionContext.getRequest().getSession().getAttribute(
				LoginFilter.LOGIN_GA_USER) != null) {
			userId = stringUtils.decodeBase64(""
					+ ServletActionContext.getRequest().getSession()
							.getAttribute(LoginFilter.LOGIN_GA_USER));
		}

		if (userId.equalsIgnoreCase("")) {
			return null;
		} else {
			return userAccessor.getById(userId);
		}
	}

	private HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
}