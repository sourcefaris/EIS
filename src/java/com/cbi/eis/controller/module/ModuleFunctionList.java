package com.cbi.eis.controller.module;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.ModuleFunction;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactory;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactoryAware;

public class ModuleFunctionList extends DefaultAction implements HibernateSessionFactoryAware {
	private List<ModuleFunction> modules ;
	private HibernateSessionFactory hsf;
	
	@Override
	public String execute() throws Exception {
		Criteria criteria = hsf.createSession().createCriteria(ModuleFunction.class);
		criteria.add(Expression.eq("parent", "true"));
		criteria.add(Expression.ne("id", "5"));
		modules = criteria.list();
		return SUCCESS;
	}
	
	public List<ModuleFunction> getModules() {
		return modules;
	}
	
	public void setModules(List<ModuleFunction> modules) {
		this.modules = modules;
	}

	@Override
	public void setHibernateSessionFactory(HibernateSessionFactory hsf) {
		this.hsf = hsf;
	}

}
