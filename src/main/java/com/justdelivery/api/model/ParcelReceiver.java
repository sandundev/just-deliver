package com.justdelivery.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ParcelReceiver {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}
	
}
