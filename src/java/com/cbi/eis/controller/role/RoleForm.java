package com.cbi.eis.controller.role;

import java.util.ArrayList;
import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.Role;

public class RoleForm extends DefaultAction{
	private Role role = new Role();
	private List<Role> roles = new ArrayList<>();
	
	@Override
	public String execute() throws Exception {
		if(getRole().getId()!=null&&!"".equalsIgnoreCase(getRole().getId().trim()))
			role = (Role) persistence.getById(Role.class, getRole().getId());
		return super.execute();
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
