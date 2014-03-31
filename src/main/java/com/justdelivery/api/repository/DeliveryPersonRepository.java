package com.justdelivery.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justdelivery.api.model.core.DeliveryPerson;

@Repository
public interface DeliveryPersonRepository extends CrudRepository<DeliveryPerson, String>{
	
}
