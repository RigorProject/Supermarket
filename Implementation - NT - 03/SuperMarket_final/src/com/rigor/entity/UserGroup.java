package com.rigor.entity;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USERS_GROUPS")
@AssociationOverrides({
	@AssociationOverride(name = "primaryKey.user", 
		joinColumns = @JoinColumn(name = "USER_ID")),
	@AssociationOverride(name = "primaryKey.group", 
		joinColumns = @JoinColumn(name = "GROUP_ID")) })
public class UserGroup {
	// composite-id key
	private UserGroupId primaryKey = new UserGroupId();
	
	// additional fields
	private boolean activated;
	private Date registeredDate;

	@EmbeddedId
	public UserGroupId getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(UserGroupId primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Transient
	public User getUser() {
		return getPrimaryKey().getUser();
	}

	public void setUser(User user) {
		getPrimaryKey().setUser(user);
	}

	@Transient
	public Group getGroup() {
		return getPrimaryKey().getGroup();
	}

	public void setGroup(Group group) {
		getPrimaryKey().setGroup(group);
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	@Column(name = "REGISTERED_DATE")
	@Temporal(TemporalType.DATE)
	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
}
