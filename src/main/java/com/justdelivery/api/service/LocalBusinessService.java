package com.justdelivery.api.service;

import com.justdelivery.api.model.core.DeliveryStatus;
import com.justdelivery.api.model.core.LocalBusiness;

public interface LocalBusinessService {
	
	public String registerLocalBusiness(LocalBusiness localBusiness);
	
	public DeliveryStatus getDeliveryStatusForOrderId(String orderId);
	
	public void sendMessageToDeliveryPerson(String personId, String message, String messageType);

	public void setDeliveryPersonForDeliveryOrder(String orderId, String personId);
}
