package com.justdelivery.api.model.core;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryPerson {

	@Id
	String id;
	
	String name;
	
	Integer age;
	
	String vehicleType;
	
	CurrentLocation currentLocation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
}
