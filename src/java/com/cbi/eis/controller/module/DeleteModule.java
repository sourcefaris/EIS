package com.cbi.eis.controller.module;

import com.cbi.eis.entity.ModuleFunction;

public class DeleteModule extends ModuleForm{
	@Override
	public String execute() throws Exception {
		String result = super.execute();
		if (result.equalsIgnoreCase(SUCCESS)) {
			persistence.remove(getModuleFunction());
			addActionMessage("Successfully Deleted");
			setModuleFunction(null);
			return SUCCESS;
		} else {
			addActionError("Cannot find such ModuleFunction");
			return ERROR;
		}
	}

}
