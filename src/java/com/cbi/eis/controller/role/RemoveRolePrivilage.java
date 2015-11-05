package com.cbi.eis.controller.role;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.Role;
import com.cbi.eis.entity.RolePrivilage;

public class RemoveRolePrivilage extends DefaultAction{
	private RolePrivilage rf;
	private Role role;
	private String rolePrivilageId = "";
	private String id = "";
	
	@Override
	public String execute() throws Exception {
		if(!getRolePrivilageId().equalsIgnoreCase("") && !getId().equalsIgnoreCase("")){
			rf = (RolePrivilage) persistence.getById(RolePrivilage.class, getRolePrivilageId());
			role = (Role) persistence.getById(Role.class, getId());
			persistence.remove(rf);
			return SUCCESS;
		}
		
		return ERROR;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getRolePrivilageId() {
		return rolePrivilageId;
	}
	
	public void setRolePrivilageId(String rolePrivilageId) {
		this.rolePrivilageId = rolePrivilageId;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
