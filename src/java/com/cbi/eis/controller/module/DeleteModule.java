package com.cbi.eis.controller.module;

import com.cbi.eis.entity.ModuleFunction;

public class DeleteModule extends ModuleForm{
	@Override
	public String execute() throws Exception {
		String result = super.execute();
		if (result.equalsIgnoreCase(SUCCESS)) {
			ModuleFunction mf = getModuleFunction().getModuleFunction();
			if (mf != null) {
				mf.getModuleFunctions().remove(getModuleFunction());
				getModuleFunction().setModuleFunction(null);
				persistence.save(mf);
			}
			persistence.save(getModuleFunction());
			setModuleFunction((ModuleFunction) persistence.getById(
					ModuleFunction.class, getModuleFunction().getId()));
			for (ModuleFunction m : getModuleFunction().getModuleFunctions()) {
				m.setModuleFunction(null);
				persistence.save(m);
			}
			persistence.remove(getModuleFunction());
			return SUCCESS;
		} else {
			addActionError("Cannot find such ModuleFunction");
			return ERROR;
		}
	}

}
