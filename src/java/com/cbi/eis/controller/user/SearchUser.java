package com.cbi.eis.controller.user;

import java.sql.SQLException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

import com.cbi.eis.entity.User;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactory;
import com.cbi.eis.persistence.hibernate.HibernateSessionFactoryAware;

public class SearchUser extends UserForm implements HibernateSessionFactoryAware{
	private Session session;  
	private HibernateSessionFactory hsf;
	private int maxPage, currPage, nextPage, prevPage = 0, page = 0;
	private int maxRowPerPage = 10;
	private String orderBy = "username";
	private int resultRows;
	private String username="";
	private String fullName="";
	private String workbookId;
	private String workbookName;
	
	@Override
	public String execute() throws Exception {
		try {
			session = hsf.createSession();
			Criteria criteria = session.createCriteria(User.class);
			if(!getUsername().equalsIgnoreCase(""))
				criteria.add(Expression.like("username", "%" + getUsername() + "%"));
			if(!getFullName().equalsIgnoreCase(""))
				criteria.add(Expression.like("fullName", "%"+getFullName()+"%"));
			criteria.add(Expression.isNotNull("siteRoleTableau"));
			criteria.add(Expression.ne("siteRoleTableau","".trim()));
			
			resultRows = criteria.list().size();
			maxPage = resultRows / maxRowPerPage;
			if (resultRows % maxRowPerPage == 0) maxPage = maxPage - 1;
			
			setUsers(criteria.addOrder(Order.asc(orderBy)).setFirstResult(currPage*maxRowPerPage).setMaxResults(maxRowPerPage).list());
			prevPage = currPage - 1;
			nextPage = currPage + 1;
			page = currPage + 1;
			
			setUsers(criteria.list());
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

	@Override
	public void setHibernateSessionFactory(HibernateSessionFactory hsf) {
		this.hsf = hsf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
	
}
