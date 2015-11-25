package com.cbi.eis.sitemanager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.ModuleFunction;
import com.cbi.eis.entity.RestrictWorkbook;
import com.cbi.eis.persistence.PersistenceManager;

public class SiteTreeLeaf extends DefaultAction{

	private ModuleFunction moduleFunction = null;
	private String sId = "";
	private String MTMJavaScript = "", variableNode = "";
	private int i, Node;
	private PersistenceManager pm;
	// default variable
	String mySQL;

	/**
	 * Constructor for recursive only
	 */
	public SiteTreeLeaf(String rootId, String variableNode, int Node, PersistenceManager manager)
			throws ClassNotFoundException, Exception {
		this.sId = rootId;
		this.moduleFunction = (ModuleFunction) manager.getById(ModuleFunction.class, rootId);
		this.Node = Node;
		this.variableNode = variableNode;
		this.pm = manager;
	}

	/**
	 * return moduleFunction
	 */
	public ModuleFunction getRoot() {
		return this.moduleFunction;
	}

	public String getMTMJavaScript() throws ClassNotFoundException, SQLException, Exception {
		SiteTreeLeaf dbTreeWalkerChild;

		String sParentId = "";
		i = 0;
		mySQL = "FROM mf in " + ModuleFunction.class + " WHERE mf.moduleFunction.id = '" + this.sId
				+ "' ORDER BY(mf.sorting)";
		List<ModuleFunction> modules = new ArrayList<ModuleFunction>();
		modules = (List<ModuleFunction>) pm.getList(mySQL);
		for (ModuleFunction mf : modules) {
			sParentId = mf.getId();
			ModuleFunction mFunction = (ModuleFunction) pm.getById(ModuleFunction.class, sParentId);
			dbTreeWalkerChild = new SiteTreeLeaf(mFunction.getId(), variableNode + "_" + Node, i, pm);
			if (mf.getModuleDescriptor() != null
					&& !mf.getModuleDescriptor().getId().trim().equalsIgnoreCase("")) {
				String sUrlAction = "../module/" + mf.getModuleDescriptor().getName() + "/"
						+ mf.getModuleDescriptor().getActionName();
				List<RestrictWorkbook> restrictWorkbooks = pm.getList("FROM "+RestrictWorkbook.class.getName()+" rwb WHERE rwb.userId='"+getCurrentUser().getUserTableauId()+"' AND rwb.workbookId='"+mf.getModuleDescriptor().getWorkbookId()+"'");
				if(restrictWorkbooks.isEmpty()){
					MTMJavaScript = MTMJavaScript + "<div class=\"pkg-body\">";
					MTMJavaScript = MTMJavaScript + "<a target=\"main\" href=\"" + sUrlAction + ".action\">"
							+ mf.getName().replace("<br>", "") + "</a>";
					MTMJavaScript = MTMJavaScript + "</div>";
				}
			} else {
				MTMJavaScript = MTMJavaScript + "<div class=\"pkg\"><h3>" + mf.getName().replace("<br>", "")
						+ "</h3><div class=\"pkg-body\">";
				MTMJavaScript = MTMJavaScript + dbTreeWalkerChild.getMTMJavaScript();
				MTMJavaScript = MTMJavaScript + "</div></div>";
			}
			i++;
		}
		return MTMJavaScript;
	}
}