package com.justdelivery.api.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.justdelivery.api.model.Address;
import com.justdelivery.api.model.Driver;
import com.justdelivery.api.model.GPSDevice;
import com.justdelivery.api.model.Location;
import com.justdelivery.api.model.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class PersonRegistrationServiceImplTest {

	@Autowired
	private PersonRegistrationServiceImpl personRegistrationService;
	@Autowired
	private MongoOperations operations;
	
	@Before
	public void setup() {
	//	personRegistrationService = new PersonRegistrationServiceImpl();
	
	}

	@Test
	public void register_shouldReturnPersonId(){
		
		Person person = new Person();
		
		Date registrationDate = new Date();
		String firstName = "Sandun"+registrationDate.getTime();
		String lastName = "Lewke "+registrationDate.getTime();
	 
		person.setFirstName(firstName);
		person.setLastName(lastName);
		
		Address address = new Address();
		address.setLine1("Edgeware Road");
		address.setLine2("Hendon");
		address.setPostCode("NW9 0PB");
		
		person.setAddress(address);
		person.setEmail("sandun.xyz"+registrationDate.getTime()+"@gmail.com");
		person.setPassword("passWordHashed");
		
		personRegistrationService.register(person);
	}
	
	@Test
	public void register_shouldReturnDriverId(){
		
		
		Driver person = new Driver();
		
		Date registrationDate = new Date();
		String firstName = "Sandun"+registrationDate;
		String lastName = "Lewke "+registrationDate.getTime();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		
		Address address = new Address();
		address.setLine1("Edgeware Road");
		address.setLine2("Hendon");
		address.setPostCode("NW9 0PB");
		person.setAddress(address);
		person.setEmail("sandun.xyz"+registrationDate.getTime()+"@gmail.com");
		person.setPassword("passWordHashed");
		Set<GPSDevice> gpsDevices = new HashSet<GPSDevice>();
		
		GPSDevice gpsDevice = new GPSDevice();
		gpsDevice.setImeiNumber("GYHJIOHUHUUIHH443436ASHGGXH"+registrationDate.getTime());
		
		Location currentLocation = new Location();
		currentLocation.setLastUpdated(registrationDate);
		double[] position = {-73.99171, 40.738868};
		currentLocation.setPosition(position);
	 
		operations.insert(gpsDevice);
		
		gpsDevices.add(gpsDevice);
		person.setGpsDevices(gpsDevices);
	 
		personRegistrationService.register(person);
	}
}
