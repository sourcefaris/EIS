package com.cbi.eis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity()
@Table(name="role_privilage")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class RolePrivilage {
	private String id;
	private Role role;
	private ModuleFunction moduleFunction;

	@ManyToOne
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne
	@JoinColumn(name="module_function_id")
	public ModuleFunction getModuleFunction() {
		return moduleFunction;
	}

	public void setModuleFunction(ModuleFunction moduleFunction) {
		this.moduleFunction = moduleFunction;
	}
	
	@Id() @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
