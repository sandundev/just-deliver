package com.justdelivery.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justdelivery.api.model.Person;
import com.justdelivery.api.repository.person.PersonRepository;

@Service
public class PersonRegistrationServiceImpl implements PersonRegistrationService<Person> {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public String register(Person person) {
		
		return personRepository.save(person).getId();
	 
	}

}
