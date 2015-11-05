package com.cbi.eis.controller.permission;

import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.GranteeCapabilitiesType;
import tableau.api.rest.bindings.PermissionsType;

public class DeletePermission extends PermissionForm{
	
	@Override
	public String execute() throws Exception {
		TableauService.deleteWorkbookPermission(getWorkbookId(), getUserId(), getCapabilityName(), getCapabilityMode());

		PermissionsType permissionTypes = TableauService.getWorkbookPermission(getWorkbookId());
		for(GranteeCapabilitiesType gType : permissionTypes.getGranteeCapabilities()){
			if(gType.getUser()!=null&& gType.getUser().getId().equalsIgnoreCase(getUserId().trim())){
				setCapabilities(gType.getCapabilities().getCapability());
			}
			
		}
		return SUCCESS;
	}

}
