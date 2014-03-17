package com.justdelivery.api.model.core;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CurrentLocation {

	@Id
	private String id;
	
	private String address;
	
	private String longitude;
	
	private String latitude;
	
	private String lastUpdatedTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
}
