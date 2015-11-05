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
@Table(name = "backend_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User{
	private String id;
	private String username;
	private String fullName;
	private String email;
	private String password;
	private Role role;
	private String siteRoleTableau;
	private String userTableauId;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToOne()
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getSiteRoleTableau() {
		return siteRoleTableau;
	}
	
	public void setSiteRoleTableau(String siteRoleTableau) {
		this.siteRoleTableau = siteRoleTableau;
	}
	
	public String getUserTableauId() {
		return userTableauId;
	}
	
	public void setUserTableauId(String userTableauId) {
		this.userTableauId = userTableauId;
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