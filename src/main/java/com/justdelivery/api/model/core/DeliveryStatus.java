package com.justdelivery.api.model.core;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryStatus {
	
	@Id
	String id;

	String stage;

	String commentByBusiness;
	
	String commentByPerson;
	
	String commentByCustomer;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getCommentByBusiness() {
		return commentByBusiness;
	}

	public void setCommentByBusiness(String commentByBusiness) {
		this.commentByBusiness = commentByBusiness;
	}

	public String getCommentByPerson() {
		return commentByPerson;
	}

	public void setCommentByPerson(String commentByPerson) {
		this.commentByPerson = commentByPerson;
	}

	public String getCommentByCustomer() {
		return commentByCustomer;
	}

	public void setCommentByCustomer(String commentByCustomer) {
		this.commentByCustomer = commentByCustomer;
	}
}
