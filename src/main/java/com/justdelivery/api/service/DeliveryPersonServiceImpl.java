package com.justdelivery.api.service;

import org.springframework.stereotype.Service;

import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;

@Service
public class DeliveryPersonServiceImpl implements DeliveryPersonService{

	@Override
	public String registerDeliveryPerson(DeliveryPerson deliveryPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCurrentLocationForDeliveryPerson(String personId, CurrentLocation currentLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDeliveryStatusStageForDeliveryOrder(String orderId, String stage) {
		// TODO Auto-generated method stub
		
	}

}
