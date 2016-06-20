package com.rigor.entity;



import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grn")
public class Grn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GRN_ID")
	private int grnID;
	
	@Column(name = "Date")
	private Date date;

	 private Set<GrnItem> userGroups = new HashSet<GrnItem>();

	public int getGrnID() {
		return grnID;
	}


	public void setGrnID(int grnID) {
		this.grnID = grnID;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
/**
 * Added by Nadeesha Thilakarathne 
 * ***/
	@OneToMany(mappedBy = "primaryKey.grn" )
	public Set<GrnItem> getUserGroups() {
		return userGroups;
	}


	public void setUserGroups(Set<GrnItem> userGroups) {
		this.userGroups = userGroups;
	}


}
