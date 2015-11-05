package com.cbi.eis.controller.descriptor;

import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.service.TableauService;

public class DeleteDescriptor extends DescriptorForm{
	@Override
	public String execute() throws Exception {
		setViews(TableauService.getViews(getWorkbookId(), 1000, 1).getView());
		if(getDescriptor().getId()!=null&&!"".equalsIgnoreCase(getDescriptor().getId().trim())){
			setDescriptor((Descriptor)persistence.getById(Descriptor.class, getDescriptor().getId()));
			persistence.remove(getDescriptor());
			setDescriptors(persistence.getList("FROM "+Descriptor.class.getName()+" dsc WHERE dsc.name='"+getWorkbookName()+"'"));
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
