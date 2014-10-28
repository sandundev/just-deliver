package com.justdelivery.api.model;

public class BusinessUnit {
    
	private String businessName;
	
	private Address address;

	public String getBusinessName() {
	    return businessName;
	}

	public void setBusinessName(String businessName) {
	    this.businessName = businessName;
	}

	public Address getAddress() {
	    return address;
	}

	public void setAddress(Address address) {
	    this.address = address;
	} 
}
