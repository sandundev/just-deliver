package com.justdelivery.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.justdelivery.api.dao.LocalBusinessDao;
import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;
import com.justdelivery.api.model.core.DeliveryStatus;
import com.justdelivery.api.model.core.LocalBusiness;

@Service
public class LocalBusinessServiceImpl implements LocalBusinessService{
	
	private LocalBusinessDao localBusinessDao;

	@Override
	public String registerLocalBusiness(LocalBusiness localBusiness) {
		return localBusinessDao.save(localBusiness).getId();
		 
	}
	@Override
	public List<DeliveryPerson> getDeliveryPersonListForPostCodeAndRadius(String postCode, Double radius, Long seconds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentLocation getCurrentLocationForDeliveryPersonId(String personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryStatus getDeliveryStatusForOrderId(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendMessageToDeliveryPerson(String personId, String message,String messageType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeliveryPersonForDeliveryOrder(String orderId, String personId) {
		// TODO Auto-generated method stub
		
	}
	
	@Autowired
	public void setLocalBusinessDao(LocalBusinessDao localBusinessDao) {
		this.localBusinessDao = localBusinessDao;
	}
}
