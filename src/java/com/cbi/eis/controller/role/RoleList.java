package com.cbi.eis.controller.role;

import com.cbi.eis.entity.Role;

public class RoleList extends RoleForm {
	@Override
	public String execute() throws Exception {
		setRoles(persistence.findAll(Role.class));
		return super.execute();
	}

}
