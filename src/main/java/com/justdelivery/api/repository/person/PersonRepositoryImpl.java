package com.justdelivery.api.repository.person;

import org.jvnet.hk2.annotations.Service;

import com.justdelivery.api.model.Person;

@Service
public class PersonRepositoryImpl implements CustomPersonRepository{

	@Override
	public Person findByGPSDeviceRegistrationId(String appRegistrationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
