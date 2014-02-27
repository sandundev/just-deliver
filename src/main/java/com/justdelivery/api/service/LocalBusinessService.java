package com.justdelivery.api.service;

import java.util.List;

import com.justdelivery.api.model.core.DeliveryPerson;

public interface LocalBusinessService {

	public List<DeliveryPerson> getDeliveryPersonListForPostCodeAndRadius(String postCode, Double radius);
}
