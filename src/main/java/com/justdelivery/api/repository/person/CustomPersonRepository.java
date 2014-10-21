package com.justdelivery.api.repository.person;
import com.justdelivery.api.model.Person;

public interface CustomPersonRepository {

	Person findByGPSDeviceRegistrationId(String appRegistrationId);
}
