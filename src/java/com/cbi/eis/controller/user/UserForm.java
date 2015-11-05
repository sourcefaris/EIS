package com.cbi.eis.controller.user;

import java.util.ArrayList;
import java.util.List;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.User;
import com.cbi.eis.service.TableauService;

import tableau.api.rest.bindings.UserType;

public class UserForm extends DefaultAction{
	private User user = new User();
	private List<User> users = new ArrayList<>();
	private List <UserType> userTableaus;
	
	@Override
	public String execute() throws Exception { 
		userTableaus = TableauService.getResponseQueryUsersOnSite(1000, 1).getUsers().getUser();
		if(getUser().getId()!=null&&!"".equalsIgnoreCase(getUser().getId().trim()))
			user = (User) persistence.getById(User.class, getUser().getId());
		return super.execute();
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<UserType> getUserTableaus() {
		return userTableaus;
	}
}
