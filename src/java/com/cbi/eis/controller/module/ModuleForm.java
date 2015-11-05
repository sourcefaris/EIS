package com.cbi.eis.controller.module;

import java.util.ArrayList;
import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.ModuleFunction;

public class ModuleForm extends DefaultAction{
	private ModuleFunction moduleFunction = new ModuleFunction();
	private List<ModuleFunction> moduleFunctions = new ArrayList<>();
	
	@Override
	public String execute() throws Exception {
		if(getModuleFunction().getId()!=null&&!"".equalsIgnoreCase(getModuleFunction().getId().trim()))
			moduleFunction = (ModuleFunction) persistence.getById(ModuleFunction.class, getModuleFunction().getId());
		return SUCCESS;
	}
	
	public ModuleFunction getModuleFunction() {
		return moduleFunction;
	}
	
	public void setModuleFunction(ModuleFunction moduleFunction) {
		this.moduleFunction = moduleFunction;
	}
	
	public List<ModuleFunction> getDescriptors() {
		return moduleFunctions;
	}
	
	public void setModuleFunctions(List<ModuleFunction> moduleFunctions) {
		this.moduleFunctions = moduleFunctions;
	}
	
	public List<ModuleFunction> getModuleFunctions() {
		return moduleFunctions;
	}

}
