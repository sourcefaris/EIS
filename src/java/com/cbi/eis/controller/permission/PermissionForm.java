package com.cbi.eis.controller.permission;

import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.CapabilityType;
import tableau.api.rest.bindings.GranteeCapabilitiesType;
import tableau.api.rest.bindings.PermissionsType;

public class PermissionForm extends DefaultAction {
	private String workbookId;
	private String workbookName;
	private int resultRows;
	private String username;
	private String userId;
	private String capabilityName;
	private String capabilityMode;
	private List<CapabilityType> capabilities;
	
	@Override
	public String execute() throws Exception {
		PermissionsType permissionTypes = TableauService.getWorkbookPermission(workbookId);
		for(GranteeCapabilitiesType gType : permissionTypes.getGranteeCapabilities()){
			if(gType.getUser()!=null&& gType.getUser().getId().equalsIgnoreCase(getUserId().trim())){
				setCapabilities(gType.getCapabilities().getCapability());
			}
			
		}
		return SUCCESS;
	}

	public String getWorkbookId() {
		return workbookId;
	}

	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}

	public String getWorkbookName() {
		return workbookName;
	}

	public void setWorkbookName(String workbookName) {
		this.workbookName = workbookName;
	}
	
	public int getResultRows() {
		return resultRows;
	}
	
	public void setResultRows(int resultRows) {
		this.resultRows = resultRows;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public List<CapabilityType> getCapabilities() {
		return capabilities;
	}
	
	public void setCapabilities(List<CapabilityType> capabilities) {
		this.capabilities = capabilities;
	}

	public String getCapabilityName() {
		return capabilityName;
	}

	public void setCapabilityName(String capabilityName) {
		this.capabilityName = capabilityName;
	}

	public String getCapabilityMode() {
		return capabilityMode;
	}

	public void setCapabilityMode(String capabilityMode) {
		this.capabilityMode = capabilityMode;
	}
	
}
