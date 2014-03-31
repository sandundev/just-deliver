package com.justdelivery.api.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.justdelivery.api.exception.DeliveryPersonNotFound;
import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class DeliveryPersonServiceTest {

	@Autowired
	private DeliveryPersonService deliveryPersonService;
	
	@Test
	public void should_CreatDeliveryPerson() {
		
		DeliveryPerson deliveryPerson = getTestDeliveryPerson();
		
		DeliveryPerson newDeliveryPerson = deliveryPersonService.createDeliveryPerson(deliveryPerson);
	
		assertThat(newDeliveryPerson.getId(), is(notNullValue()));
	}
	
	@Test
	public void should_GetDeliveryPersonListWithinRadius(){
		
		Double radius = 178.47741345522198; //10km
		CurrentLocation location= getTestCurrentLocation(51.029855,-0.123889);
		
		List<DeliveryPerson> deliveryPersonList = deliveryPersonService.getDeliveryPersonListForLocationAndRadius(location, radius, new Date());
		
		assertThat("list should not be null",deliveryPersonList,is(notNullValue()));
		assertThat("list should not be empty",deliveryPersonList,is(not(empty())));
	}


	@Test
	public void should_UpdateLocationForDeliveryPerson() throws DeliveryPersonNotFound{
		
		CurrentLocation newLocation = getTestCurrentLocation(54.4442255,-1.145889);
		
		deliveryPersonService.updateCurrentLocationForDeliveryPerson("5338a6893b7e438fb3da5aee", newLocation);

		CurrentLocation updatedPerson = deliveryPersonService.findDeliveryPersonById("5338a6893b7e438fb3da5aee").getCurrentLocation();
	 
		assertThat("updatedPerson person should have same Latitude",newLocation.getLatitude(),is(updatedPerson.getLatitude()));
	}
	
	
	private DeliveryPerson getTestDeliveryPerson() {
		DeliveryPerson deliveryPerson = new DeliveryPerson();
		deliveryPerson.setName("Delivery Boy 1");
		deliveryPerson.setAge(12);
		deliveryPerson.setVehicleType("BMW 3 Series");
		
		CurrentLocation currentLocation = getTestCurrentLocation(50.629855,-0.213889);
		
		deliveryPerson.setCurrentLocation(currentLocation);
		return deliveryPerson;
	}

	private CurrentLocation getTestCurrentLocation(double latitude,double longitude) {
		CurrentLocation currentLocation = new CurrentLocation();
		currentLocation.setAddress("Current Address of Deli Boy");
		currentLocation.setLatitude(latitude);
		currentLocation.setLongitude(longitude);
		return currentLocation;
	}

}
