package com.cbi.eis.controller.descriptor;

import java.util.List;

import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.service.TableauService;

public class SaveDescriptor extends DescriptorForm {
	@Override
	public String execute() throws Exception {
		
		Descriptor descr = null;
		if(getDescriptor().getId()!=null&&!"".equalsIgnoreCase(getDescriptor().getId().trim()))
			descr = (Descriptor) persistence.getById(Descriptor.class, getDescriptor().getId());
		else {
			descr = new Descriptor();
		}
		if(hasErrors()){
			setError(true);
			return INPUT;
		} else {
			descr.setName(getWorkbookName());
			descr.setActionName(getContentUrl().split("/")[2].trim());
			descr.setWorkbookId(getWorkbookId());
			descr.setTableau(true);	
			setViews(TableauService.getViews(getWorkbookId(), 1000, 1).getView());
			setDescriptors(persistence.getList("FROM "+Descriptor.class.getName()+" dsc WHERE dsc.name='"+getWorkbookName()+"'"));

			if(urlContains((getWorkbookName()+"/"+getContentUrl().split("/")[2].trim()))==true) {
				persistence.save(descr); 
				addActionMessage("Descriptor saved");
				setDescriptors(persistence.getList("FROM "+Descriptor.class.getName()+" dsc WHERE dsc.name='"+getWorkbookName()+"'"));
				return SUCCESS;
			} else {
				return INPUT;
			}
		} 
	}
	
	private boolean urlContains(String url){
		List<Descriptor> dList = persistence.findAll(Descriptor.class);
		for (Descriptor des: dList){
			if((des.getName()+"/"+des.getActionName()).equalsIgnoreCase(url)) return false ;
		}
		return true ;
	}

}
