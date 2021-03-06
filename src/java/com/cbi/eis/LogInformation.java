package com.cbi.eis;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Transient;


public class LogInformation implements Serializable {
	private Timestamp createDate = new Timestamp(0);
	private Timestamp lastUpdateDate = new Timestamp(0);
	private String createBy = "";
	private String lastUpdateBy = "";
	private int activeFlag;
	public final static int ACTIVE = 1;
	public final static int INACTIVE = 0;
	
	public LogInformation() {
		
	}
	
	public LogInformation(String userId, int flag) {
		setActiveFlag(flag);
		setCreateBy(userId);
		setLastUpdateBy(userId);
		setCreateDate(new Timestamp(System.currentTimeMillis()));
		setLastUpdateDate(new Timestamp(System.currentTimeMillis()));
	}
	public LogInformation(LogInformation logInfo, String userId, int flag){
		setCreateBy(logInfo.getCreateBy());
		setCreateDate(logInfo.getCreateDate());
		setLastUpdateBy(userId);
		setLastUpdateDate(new Timestamp(System.currentTimeMillis()));
		setActiveFlag(flag);
	}
	/**
	 * @return Returns the createBy.
	 * @hibernate.property length="28" column="create_by"
	 */
	@Column(name="create_by")
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * @param createBy The createBy to set.
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * @return Returns the lastUpdateBy.
	 * @hibernate.property length="28" column="update_by"
	 */
	@Column(name="update_by")
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	/**
	 * @param lastUpdateBy The lastUpdateBy to set.
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	/**
	 * @return Returns the createDate.
	 */
	@Column(name="create_date")
	public Timestamp getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate The createDate to set.
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return Returns the lastUpdateDate.
 * 
	 */
	@Column(name="update_date")
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	/**
	 * @param lastUpdateDate The lastUpdateDate to set.
	 */
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Column(name="active_flag")
	public int getActiveFlag() {
		return activeFlag;
	}
	/**
	 * @param activeFlag The activeFlag to set.
	 */
	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}
	@Transient
	public boolean isActive() {
		return (this.activeFlag == ACTIVE);
	}
	@Transient	
	public boolean isInactive() {
		return (this.activeFlag == INACTIVE);
	}
	

}
