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
@Table(name = "restrict_workbook")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class RestrictWorkbook {
	private String id;
	private String userId;
	private String workbookId;
	
	@Id() @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Column(name="workbookId", nullable=true)
	public String getWorkbookId() {
		return workbookId;
	}
	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}
	
	
}
