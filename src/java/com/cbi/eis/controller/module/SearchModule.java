package com.cbi.eis.controller.module;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.cbi.eis.entity.ModuleFunction;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactory;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactoryAware;

public class SearchModule extends ModuleForm implements HibernateSessionFactoryAware{
	private Session session;  
	private HibernateSessionFactory hsf;
	private int maxPage, currPage, nextPage, prevPage = 0, page = 0;
	private int maxRowPerPage = 10;
	private String orderBy = "name";
	private int resultRows;
	private String name = "";
	List<String> contentUrls = new ArrayList<>();
	@Override
	public String execute() throws Exception {
		try {
			session = hsf.createSession();
			Criteria criteria = session.createCriteria(ModuleFunction.class);
			if(!getName().equalsIgnoreCase(""))
				criteria.add(Expression.like("name", "%" + getName() + "%"));
			criteria.add(Expression.ne("id", "1"));
			criteria.add(Expression.ne("id", "2"));
			criteria.add(Expression.ne("id", "3"));
			criteria.add(Expression.ne("id", "4"));
			criteria.add(Expression.ne("id", "5"));
			resultRows = criteria.list().size();
			maxPage = resultRows / maxRowPerPage;
			if (resultRows % maxRowPerPage == 0) maxPage = maxPage - 1;
			
			setModuleFunctions(criteria.addOrder(Order.asc(orderBy)).setFirstResult(currPage*maxRowPerPage).setMaxResults(maxRowPerPage).list());
			prevPage = currPage - 1;
			nextPage = currPage + 1;
			page = currPage + 1;
			
			setModuleFunctions(criteria.list());
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
	
	
	
	

}
