package com.justdelivery.api.service;

import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;

public interface DeliveryPersonService {

	public String registerDeliveryPerson(DeliveryPerson deliveryPerson);
	
	public void updateCurrentLocationForDeliveryPerson(String personId, CurrentLocation currentLocation);

	public void updateDeliveryStatusStageForDeliveryOrder(String orderId, String stage);
}
