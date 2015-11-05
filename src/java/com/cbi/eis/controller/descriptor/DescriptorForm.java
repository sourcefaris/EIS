package com.cbi.eis.controller.descriptor;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.ViewType;
import tableau.api.rest.bindings.WorkbookType;

public class DescriptorForm extends DefaultAction{
	private Descriptor descriptor = new Descriptor();
	private List<Descriptor> descriptors = new ArrayList<>();
	private List<WorkbookType> workbooks;
	private List<ViewType> views;
	private String workbookId;
	private String workbookName;
	private String contentUrl;
	
	@Override
	public String execute() throws Exception {
		if(getWorkbookId()!=null&&!"".equalsIgnoreCase(getWorkbookId().trim())){
			setViews(TableauService.getViews(getWorkbookId(), 1000, 1).getView());
			setWorkbookName(getViews().get(0).getContentUrl().split("/")[0].trim());
			setDescriptors(persistence.getList("FROM "+Descriptor.class.getName()+" dsc WHERE dsc.name='"+getWorkbookName()+"'"));
			return "workbook_detail";
		} else {
			setWorkbooks((List<WorkbookType>) ServletActionContext.getRequest().getSession().getAttribute(LoginFilter.TABLEAU_WORKBOOKS));
			return SUCCESS;
		}
	}
	
	public Descriptor getDescriptor() {
		return descriptor;
	}
	
	public void setDescriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
	}
	
	public List<Descriptor> getDescriptors() {
		return descriptors;
	}
	
	public void setDescriptors(List<Descriptor> descriptors) {
		this.descriptors = descriptors;
	}
	
	public List<WorkbookType> getWorkbooks() {
		return workbooks;
	}
	
	public void setWorkbooks(List<WorkbookType> workbooks) {
		this.workbooks = workbooks;
	}
	
	public List<ViewType> getViews() {
		return views;
	}
	
	public void setViews(List<ViewType> views) {
		this.views = views;
	}
	
	public String getWorkbookId() {
		return workbookId;
	}
	
	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}
	
	public String getWorkbookName() {
		return workbookName;
	}
	
	public void setWorkbookName(String workbookName) {
		this.workbookName = workbookName;
	}
	
	public String getContentUrl() {
		return contentUrl;
	}
	
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
}
