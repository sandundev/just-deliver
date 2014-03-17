package com.justdelivery.api.model.core;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LocalBusiness {

	@Id
	String id;
	
	String businessName;
	
	String address;
	
	String postCode;
	
	String firstContact;
	
	String telephone;
	
	String emailAddress;
	
	String registrationDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFirstContact() {
		return firstContact;
	}

	public void setFirstContact(String firstContact) {
		this.firstContact = firstContact;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
