package com.cbi.eis.controller.module;

import com.cbi.eis.entity.ModuleFunction;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;

@Validation
public class SaveModule extends ModuleForm {
	@Validations(requiredStrings = {
			@RequiredStringValidator(fieldName = "moduleFunction.name", message = "Please input field name")
	})
	@Override
	public String execute() throws Exception {
		ModuleFunction module = null;
		if(getModuleFunction().getId()!=null&&!"".equalsIgnoreCase(getModuleFunction().getId().trim()))
			module = (ModuleFunction) persistence.getById(ModuleFunction.class, getModuleFunction().getId());
		else
			module = new ModuleFunction();
		
		if(hasErrors()){
			setError(true);
			return INPUT;
		} else {
			module.setName(getModuleFunction().getName());
			module.setSorting(getModuleFunction().getSorting());
			module.setModuleFunction(getModuleFunction().getModuleFunction().getId().trim().equalsIgnoreCase("")?null:getModuleFunction().getModuleFunction());
			module.setIcon(getModuleFunction().getIcon());
			module.setParent(getModuleFunction().getParent());
			if(module.getParent().equalsIgnoreCase("true")){
				module.setModuleDescriptor(null);
			} else {
				module.setModuleDescriptor(getModuleFunction().getModuleDescriptor());
				if(getModuleFunction().getModuleDescriptor().getId()==null||"".equalsIgnoreCase(getModuleFunction().getModuleDescriptor().getId())){
					addFieldError("moduleFunction.descriptor.id", "Please select descriptor");
					setError(true);
					return INPUT;
				}
			}
			persistence.save(module);
			addActionMessage("Module saved");
			setModuleFunction(null);
			return SUCCESS;
		}
	}

}
