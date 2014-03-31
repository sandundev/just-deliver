package com.justdelivery.api.service;

import java.util.Date;
import java.util.List;

import com.justdelivery.api.exception.DeliveryPersonNotFound;
import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;

public interface DeliveryPersonService {

	public DeliveryPerson createDeliveryPerson(DeliveryPerson deliveryPerson);
	
	public void updateCurrentLocationForDeliveryPerson(String personId, CurrentLocation currentLocation) throws DeliveryPersonNotFound;
	
	public List<DeliveryPerson> getDeliveryPersonListForLocationAndRadius(CurrentLocation location, Double radius, Date lastUpdatedTime);

	public DeliveryPerson findDeliveryPersonById(String personId);
}
