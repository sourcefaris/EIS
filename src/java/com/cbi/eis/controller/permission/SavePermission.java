package com.cbi.eis.controller.permission;

import java.util.List;

import com.cbi.eis.entity.RestrictWorkbook;
import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.CapabilityType;
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
				for(CapabilityType capabilityType: getCapabilities()){
					if(permissionIsNotContains(getWorkbookId(), getUserId())){
						if(capabilityType.getName().equalsIgnoreCase("Read")&&capabilityType.getMode().equalsIgnoreCase("Deny")){
							RestrictWorkbook restrictWorkbook = new RestrictWorkbook();
							restrictWorkbook.setUserId(getUserId());
							restrictWorkbook.setWorkbookId(getWorkbookId());
							persistence.save(restrictWorkbook);
						}
					}
				}
			}
			
		}
		return SUCCESS;
	}
	
	private boolean permissionIsNotContains(String workbookId, String userId){
		List<RestrictWorkbook> restrictWorkbooks = persistence.findAll(RestrictWorkbook.class);
		for(RestrictWorkbook rw: restrictWorkbooks){
			if(rw.getUserId().equalsIgnoreCase(userId)&&rw.getWorkbookId().equalsIgnoreCase(workbookId)) return false;
		} return true;
	}

}
