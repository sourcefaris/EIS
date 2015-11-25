package com.cbi.eis.controller.descriptor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

import com.cbi.eis.entity.Descriptor;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactory;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactoryAware;
import com.cbi.eis.security.LoginFilter;
import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.WorkbookType;

public class SearchDescriptor extends DescriptorForm implements HibernateSessionFactoryAware{
	private Session session;  
	private HibernateSessionFactory hsf;
	private int maxPage, currPage, nextPage, prevPage = 0, page = 0;
	private int maxRowPerPage = 10;
	private String orderBy = "name";
	private int resultRows;
	private String name = "";
	private String actionName = "";
	List<String> contentUrls = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		List<WorkbookType> works = getWorkbooks();
		for(WorkbookType work:works){
			contentUrls.add(work.getContentUrl());
		}
		try {
			session = hsf.createSession();
			Criteria criteria = session.createCriteria(Descriptor.class);
			if(!getName().equalsIgnoreCase(""))
				criteria.add(Expression.like("name", "%" + getName() + "%"));
			if(!getActionName().equalsIgnoreCase(""))
				criteria.add(Expression.like("actionName", "%" + getActionName() + "%"));
			criteria.add(Expression.isNotNull("workbookId"));
			criteria.add(Expression.in("name", contentUrls));
			resultRows = criteria.list().size();
			maxPage = resultRows / maxRowPerPage;
			if (resultRows % maxRowPerPage == 0) maxPage = maxPage - 1;
			setDescriptors(criteria.addOrder(Order.asc(orderBy)).setFirstResult(currPage*maxRowPerPage).setMaxResults(maxRowPerPage).list());
			prevPage = currPage - 1;
			nextPage = currPage + 1;
			page = currPage + 1;
			
			setDescriptors(criteria.list());
			hsf.endSession(session);
			return SUCCESS;
			
		} catch (HibernateException e) {
			e.printStackTrace();
			return ERROR;
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			try {
				hsf.closeSession(session);
			} catch (HibernateException e1) {
				return ERROR;
			} catch (SQLException e1) {
				return ERROR;
			}
		}
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setMaxRowPerPage(int maxRowPerPage) {
		this.maxRowPerPage = maxRowPerPage;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public void setResultRows(int resultRows) {
		this.resultRows = resultRows;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public int getCurrPage() {
		return currPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getPage() {
		return page;
	}
	public int getMaxRowPerPage() {
		return maxRowPerPage;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public int getResultRows() {
		return resultRows;
	}
	@Override
	public void setHibernateSessionFactory(HibernateSessionFactory hsf) {
		this.hsf = hsf;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getActionName() {
		return actionName;
	}
	
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	

}
