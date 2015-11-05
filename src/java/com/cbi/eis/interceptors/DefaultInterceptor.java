package com.cbi.eis.interceptors;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.URLBean;

import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.entity.ModuleFunction;
import com.cbi.eis.entity.RolePrivilage;
import com.cbi.eis.persistence.PersistenceAware;
import com.cbi.eis.persistence.PersistenceManager;
import com.cbi.eis.security.SessionCredentials;
import com.cbi.eis.security.SessionCredentialsAware;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class DefaultInterceptor implements Interceptor, PersistenceAware,
		SessionCredentialsAware {
	private PersistenceManager manager;
	private SessionCredentials sessCredentials;
	private Descriptor descriptorCalled;

	public void destroy() {

	}

	public void init() {
	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {

		// init descriptorCalled
		URLBean bean = new URLBean();
		bean.setRequest(ServletActionContext.getRequest());
		bean.setResponse(ServletActionContext.getResponse());
		String target = ServletActionContext.getResponse().encodeRedirectURL(bean.toString());
//			String namespace = actionInvocation.getProxy().getNamespace();
		String descriptorCandidate[] = target.split("/");
		if ("module".equalsIgnoreCase(descriptorCandidate[2])) {
			String descriptorName = descriptorCandidate[3];
			String action = descriptorCandidate[4].replace(".action", "");
			descriptorCalled = (Descriptor) manager.getList("FROM "+Descriptor.class.getName()+" des WHERE des.name='"+descriptorName+"'").get(0);
			if (descriptorCalled != null) {
				if (sessCredentials.getCurrentUser() != null) {
					if (!isAuthorized(actionInvocation)) {
						if(!sessCredentials.getCurrentUser().getRole().getId().trim().equalsIgnoreCase("1"))
							return "notallowed";
					}
				} else
					return "notallowed";
			} else {
				return "notallowed";
			}
		}
		return actionInvocation.invoke();
	}

	private boolean isAuthorized(ActionInvocation actionInvocation) {
		List<ModuleFunction> modules = new ArrayList<ModuleFunction>();

		String mySQL;
		// read all module function from role_privilage
		mySQL = "SELECT rp FROM " + RolePrivilage.class.getName()
				+ " rp WHERE rp.role.id='" + sessCredentials.getCurrentUser().getRole().getId()+"'";
		List<RolePrivilage> rp = new ArrayList<RolePrivilage>();
		rp = (List<RolePrivilage>) manager.getList(mySQL);
		for (RolePrivilage tmp : rp) {
			if (checkLeafDescriptor(tmp.getModuleFunction())) {
				return true;
			}
		}
		return false;
	}

	private boolean checkLeafDescriptor(ModuleFunction parent) {
		if(parent.getModuleFunctions().size()>0){
			for (ModuleFunction mf : parent.getModuleFunctions()) {
				if(mf.getModuleFunctions().size()>0) {
					if (checkLeafDescriptor(mf)) {
						return true;
					}
				} else {
					if (descriptorCalled.equals(mf.getModuleDescriptor())) {
						return true;
					}
				} 
			}
		} else {
			if (descriptorCalled.equals(parent.getModuleDescriptor())) {
				return true;
			}
		}
		return false;
	}

	private List<ModuleFunction> getLeafPrivilage(ModuleFunction parent) {
		List<ModuleFunction> mfs = new ArrayList<ModuleFunction>();
		for (ModuleFunction mf : parent.getModuleFunctions()) {
			if (mf.getModuleFunctions().size() > 0) {
				mfs.addAll(getLeafPrivilage(mf));
			} else {
				mfs.add(mf);
			} 
		}
		return mfs;
	}

	public void setPersistenceManager(PersistenceManager arg0) {
		this.manager = arg0;
	}

	public void setSessionCredentials(SessionCredentials arg0) {
		this.sessCredentials = arg0;
	}

}
