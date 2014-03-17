package com.justdelivery.api.model.core;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryOrder {

	@Id
	String id;
	String referenceNumber;
	DeliveryPerson deliveryPerson;
	DeliveryStatus deliveryStatus;
	private String lastUpdatedTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public DeliveryPerson getDeliveryPerson() {
		return deliveryPerson;
	}
	public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
}
