package com.justdelivery.api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GPSDevice {
	
	@Id
	private String id;

	private String imeiNumber;
	
	private String appRegistrationId;

	private Date lastUpdatedDate;
	
	@DBRef
	private Person currentUser;

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}


	public String getAppRegistrationId() {
		return appRegistrationId;
	}

	public void setAppRegistrationId(String appRegistrationId) {
		this.appRegistrationId = appRegistrationId;
	}
	
	public String getId() {
		return id;
	}

	public Person getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Person currentUser) {
		this.currentUser = currentUser;
	}
	
}
