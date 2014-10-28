package com.justdelivery.api.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ParcelSender extends Person{

	private BusinessUnit businessUnit;

	public BusinessUnit getBusinessUnit() {
	    return businessUnit;
	}

	public void setBusinessUnit(BusinessUnit businessUnit) {
	    this.businessUnit = businessUnit;
	}

}
