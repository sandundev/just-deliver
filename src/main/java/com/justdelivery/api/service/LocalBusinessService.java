package com.justdelivery.api.service;

import java.util.List;

import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;
import com.justdelivery.api.model.core.DeliveryStatus;
import com.justdelivery.api.model.core.LocalBusiness;

public interface LocalBusinessService {
	
	public String registerLocalBusiness(LocalBusiness localBusiness);

	public List<DeliveryPerson> getDeliveryPersonListForPostCodeAndRadius(String postCode, Double radius, Long seconds);
	
	public CurrentLocation getCurrentLocationForDeliveryPersonId(String personId);
	
	public DeliveryStatus getDeliveryStatusForOrderId(String orderId);
	
	public void sendMessageToDeliveryPerson(String personId, String message, String messageType);

	public void setDeliveryPersonForDeliveryOrder(String orderId, String personId);
}
