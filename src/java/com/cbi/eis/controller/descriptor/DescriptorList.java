package com.cbi.eis.controller.descriptor;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactory;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactoryAware;

import tableau.api.rest.bindings.WorkbookType;

public class DescriptorList extends DefaultAction implements HibernateSessionFactoryAware{
	private List<Descriptor> descriptors ;
	private HibernateSessionFactory hsf;
	private List<String> contentUrls = new ArrayList<>();
	
	@Override
	public String execute() throws Exception {
		List<WorkbookType> works = getWorkbooks();
		for(WorkbookType work:works){
			contentUrls.add(work.getContentUrl());
		}
		Criteria criteria = hsf.createSession().createCriteria(Descriptor.class);
		criteria.add(Expression.in("name", contentUrls));
		descriptors = criteria.list();
		return super.execute();
	}
	
	public List<Descriptor> getDescriptors() {
		return descriptors;
	}
	
	public void setDescriptors(List<Descriptor> descriptors) {
		this.descriptors = descriptors;
	}

	@Override
	public void setHibernateSessionFactory(HibernateSessionFactory hsf) {
		this.hsf = hsf;
	}

}
