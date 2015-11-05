package com.cbi.eis.controller.role;

import java.sql.Timestamp;
import java.util.Iterator;

import com.cbi.eis.DefaultAction;
import com.cbi.eis.entity.ModuleFunction;
import com.cbi.eis.entity.Role;
import com.cbi.eis.entity.RolePrivilage;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;

@Validation
public class AddPrivilage extends DefaultAction{
	private String moduleFunctionId = "";
	private String id = "";
	private Role role = new Role();
	private ModuleFunction mf = new ModuleFunction();
	private RolePrivilage rolePrivilage;
	@Validations(requiredStrings = {
			@RequiredStringValidator(fieldName = "moduleFunctionId", message = "Please input Module Function")})
	public String execute(){
		role = (Role) persistence.getById(Role.class,getId());
		mf = (ModuleFunction) persistence.getById(ModuleFunction.class,getModuleFunctionId());
		Iterator it = role.getRolePrivilage().iterator();
		
		
		if(!getModuleFunctionId().equalsIgnoreCase("") && roleContain(role)){
			
			rolePrivilage = new RolePrivilage(); 
			rolePrivilage.setModuleFunction(mf);
			rolePrivilage.setRole(role);
			persistence.save(rolePrivilage);
			role.getRolePrivilage().add(rolePrivilage);
		}
		return SUCCESS;
	}
	
	public boolean roleContain(Role rl){
		Iterator it = rl.getRolePrivilage().iterator();
		while(it.hasNext()){
			RolePrivilage rp = (RolePrivilage) it.next();
			if(rp.getModuleFunction().getId().equalsIgnoreCase(getModuleFunctionId()))  return false;
		}
		return true;
	}
	/**
	 * @return Returns the id.
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return Returns the moduleFunctionId.
	 */
	public String getModuleFunctionId() {
		return moduleFunctionId;
	}
	/**
	 * @param moduleFunctionId The moduleFunctionId to set.
	 */
	public void setModuleFunctionId(String moduleFunctionId) {
		this.moduleFunctionId = moduleFunctionId;
	}
	/**
	 * @return Returns the role.
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role The role to set.
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
}
