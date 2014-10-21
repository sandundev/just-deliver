package com.justdelivery.api.service;

import com.justdelivery.api.model.Person;

public interface PersonRegistrationService <T extends Person>{
 
	public String register(T person);
	 
}
