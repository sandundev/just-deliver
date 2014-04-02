package com.justdelivery.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justdelivery.api.model.core.DeliveryStatus;
import com.justdelivery.api.model.core.LocalBusiness;
import com.justdelivery.api.repository.LocalBusinessRepository;

@Service
public class LocalBusinessServiceImpl implements LocalBusinessService{
	
	@Autowired
	private LocalBusinessRepository localBusinessDao;

	@Override
	public LocalBusiness createLocalBusiness(LocalBusiness localBusiness) {
		return localBusinessDao.save(localBusiness);
		 
	}

	@Override
	public DeliveryStatus getDeliveryStatusForOrderId(String orderId) {
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

}
