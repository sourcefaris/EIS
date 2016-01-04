package com.cbi.eis.controller.user;

import java.util.List;

import com.cbi.eis.entity.Role;
import com.cbi.eis.entity.User;
import com.cbi.eis.service.TableauService;
import com.cbi.eis.util.StringUtils;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

import tableau.api.rest.bindings.TsResponse;

public class SaveUser extends UserForm {
	@Validations(requiredStrings = {
			@RequiredStringValidator(fieldName = "user.username", message = "Please input field username"),
			@RequiredStringValidator(fieldName = "user.password", message = "Please input field password"),
			@RequiredStringValidator(fieldName = "user.fullName", message = "Please input field full name")
	})
	@Override
	public String execute() throws Exception {
		User user = null;
		if(getUser().getId()!=null&&!"".equalsIgnoreCase(getUser().getId().trim()))
			user = (User) persistence.getById(User.class, getUser().getId());
		else {
			user = new User();
			if(!usernameIsNotContains(getUser().getUsername())){
				addActionError("User is exist");
				setUser(null);
				return INPUT;
			}
		}
		if(hasErrors()) {
			setError(true);
			return INPUT;
		} else {
			user.setUsername(getUser().getUsername());
			user.setPassword(StringUtils.encodeBase64(getUser().getPassword()));
			user.setFullName(getUser().getFullName());
			user.setEmail(getUser().getEmail());
			user.setRole((Role) persistence.getById(Role.class, "2"));
			user.setSiteRoleTableau(getUser().getSiteRoleTableau());
			user.setUserTableauId(getUser().getUserTableauId());
			System.out.println("user Tableau : "+getUser().getUserTableauId());
			if(getUser().getSiteRoleTableau()!=null&&!"".equalsIgnoreCase(getUser().getSiteRoleTableau().trim())){
				TsResponse responseUpdateUser = TableauService.updateUser(getUser().getUserTableauId(), getUser().getFullName(), getUser().getEmail(), getUser().getPassword(), getUser().getSiteRoleTableau());
				if(responseUpdateUser.getUser()!=null){
					persistence.save(user);
					addActionMessage("User saved");
					setUser(null);
					return SUCCESS;
				} if(responseUpdateUser.getError()!=null){
					addActionError(responseUpdateUser.getError().getDetail());
					return INPUT;
				}
			} else {
				persistence.save(user);
				addActionMessage("User saved");
				setUser(null);
				return SUCCESS;
			}
		}
		return null;
	}
	
	private boolean usernameIsNotContains(String username){
		List<User> userList = persistence.findAll(User.class);
		for (User user: userList){
			if(user.getUsername().equalsIgnoreCase(username)) return false ;
		}
		return true ;
	}
}
