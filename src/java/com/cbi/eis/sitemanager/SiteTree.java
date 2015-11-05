package com.cbi.eis.sitemanager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.RolePrivilage;
import com.cbi.eis.entity.User;
import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.service.TableauService;
import com.opensymphony.xwork2.ActionContext;

import tableau.api.rest.bindings.WorkbookType;

public class SiteTree extends DefaultAction {
	private String roleId = "";
	private String tree_script = "";
	List<String> contentUrls = new ArrayList<>();
	private String iframeSrc;
	private String urlAction;

	public String execute() {

		String mySQL;
		String MTMJavaScript = "";
		String variableNode = "menu";

		SiteTreeLeaf dbTree;

		List<WorkbookType> works = (List<WorkbookType>) ActionContext.getContext().getSession().get(LoginFilter.TABLEAU_WORKBOOKS);
		for(WorkbookType work:works){
			contentUrls.add(work.getContentUrl());
		}

		try {
			User us = getCurrentUser();
			this.roleId = us.getRole().getId();

			int iFirstNode = 0;

			// read all module function from role_privilage
			mySQL = "FROM tmp in " + RolePrivilage.class + " WHERE tmp.role.id='" + this.roleId
					+ "' ORDER BY (tmp.moduleFunction.sorting)";
			List<RolePrivilage> rp = new ArrayList<RolePrivilage>();
			rp = (List<RolePrivilage>) persistence.getList(mySQL);
			for (RolePrivilage tmp : rp) {
				dbTree = new SiteTreeLeaf(tmp.getModuleFunction().getId(), variableNode, iFirstNode, persistence);

				if (tmp.getModuleFunction().getModuleDescriptor() != null
						&& !tmp.getModuleFunction().getModuleDescriptor().getId().trim().equalsIgnoreCase("")) {
					String sUrlAction = "../module/" + tmp.getModuleFunction().getModuleDescriptor().getName() + "/"
							+ tmp.getModuleFunction().getModuleDescriptor().getActionName();
					if(tmp.getModuleFunction().getModuleDescriptor().isTableau()==true){
						for(String contentUrl: contentUrls){
							if(contentUrl.trim().equalsIgnoreCase(tmp.getModuleFunction().getModuleDescriptor().getName().trim())){
								MTMJavaScript = MTMJavaScript + "<div class=\"pkg-body\">";
								MTMJavaScript = MTMJavaScript + "<a target=\"main\" href=\"" + sUrlAction + ".action\">"
										+ tmp.getModuleFunction().getName() + "</a>";
								MTMJavaScript = MTMJavaScript + "</div>";
								break;
							} 
						}
					} else {
						MTMJavaScript = MTMJavaScript + "<div class=\"pkg-body\">";
						MTMJavaScript = MTMJavaScript + "<a target=\"main\" href=\"" + sUrlAction + ".action\">"
								+ tmp.getModuleFunction().getName() + "</a>";
						MTMJavaScript = MTMJavaScript + "</div>";
					}
				} else {
					MTMJavaScript = MTMJavaScript + "<div class=\"pkg\"><h3>" + tmp.getModuleFunction().getName()
							+ "</h3><div class=\"pkg-body\">";
					// check the child is > 0
					MTMJavaScript = MTMJavaScript + dbTree.getMTMJavaScript(contentUrls);
					MTMJavaScript = MTMJavaScript + "</div></div>";

				}
			}
			tree_script = MTMJavaScript;
			return SUCCESS;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String getTree_script() {
		return tree_script;
	}

	public void setTree_script(String tree_script) {
		this.tree_script = tree_script;
	}
	
	public String getIframeSrc() {
		return iframeSrc;
	}
	
	public void setIframeSrc(String iframeSrc) {
		this.iframeSrc = iframeSrc;
	}
	
	public String getUrlAction() {
		return urlAction;
	}
	
	public void setUrlAction(String urlAction) {
		this.urlAction = urlAction;
	}
}
