package com.cbi.eis.controller.user;

public class DeleteUser extends UserForm {
	@Override
	public String execute() throws Exception {
		String result = super.execute();

		if (result.equalsIgnoreCase(SUCCESS)) {
			persistence.remove(getUser());
			addActionMessage("Successfully Deleted");
			setUser(null);
			return SUCCESS;
		} else {
			addActionError("Cannot find such user");
			return ERROR;
		}
	}
}
