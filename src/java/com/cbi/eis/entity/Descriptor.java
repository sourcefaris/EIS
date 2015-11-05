package com.cbi.eis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity()
@Table(name = "descriptor")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Descriptor {
	private String id;
	private String name;
	private String action = "";
	private String workbookId;
	private boolean tableau = false;

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

	@Column(name = "action")
	public String getActionName() {
		return action;
	}

	public void setActionName(String action) {
		this.action = action;
	}
	
	public String getWorkbookId() {
		return workbookId;
	}
	
	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}
	
	@Column(name = "tableauFlag")
	public boolean isTableau() {
		return tableau;
	}
	
	public void setTableau(boolean tableau) {
		this.tableau = tableau;
	}

}
