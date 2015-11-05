package com.cbi.eis.controller.permission;

import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.GranteeCapabilitiesType;
import tableau.api.rest.bindings.PermissionsType;
import tableau.api.rest.bindings.TsResponse;

public class SavePermission extends PermissionForm{
	@Override
	public String execute() throws Exception {
		TsResponse responseSavePermission = TableauService.addWorkbookPermission(getWorkbookId(), getUserId(), getCapabilityName(), getCapabilityMode());
		if(responseSavePermission.getError()!=null)
			addActionError(responseSavePermission.getError().getDetail());
		
		PermissionsType permissionTypes = TableauService.getWorkbookPermission(getWorkbookId());
		for(GranteeCapabilitiesType gType : permissionTypes.getGranteeCapabilities()){
			if(gType.getUser()!=null&& gType.getUser().getId().equalsIgnoreCase(getUserId().trim())){
				setCapabilities(gType.getCapabilities().getCapability());
			}
			
		}
		return SUCCESS;
	}

}
