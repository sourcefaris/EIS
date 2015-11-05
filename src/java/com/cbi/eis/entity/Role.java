package com.cbi.eis.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity()
@Table(name="role")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Role{
	private String id;
	private String name;
	private String description;
	private List<RolePrivilage> rolePrivilage = new ArrayList<RolePrivilage>();

	@Id() @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@OneToMany(mappedBy="role", cascade={CascadeType.ALL})
	public List<RolePrivilage> getRolePrivilage() {
		return rolePrivilage;
	}

	public void setRolePrivilage(List<RolePrivilage> rolePrivilage) {
		this.rolePrivilage = rolePrivilage;
	}
	
	
	
}
