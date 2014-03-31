package com.justdelivery.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.justdelivery.api.exception.DeliveryPersonNotFound;
import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;
import com.justdelivery.api.repository.DeliveryPersonRepository;
import com.justdelivery.api.util.maps.GeoLocation;

@Service
public class DeliveryPersonServiceImpl implements DeliveryPersonService{

	@Autowired
	private DeliveryPersonRepository deliveryPersonRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public DeliveryPerson createDeliveryPerson(DeliveryPerson deliveryPerson) {
		
		return deliveryPersonRepository.save(deliveryPerson);
	}

	@Override
	public void updateCurrentLocationForDeliveryPerson(String personId, CurrentLocation currentLocation) throws DeliveryPersonNotFound {
		
	DeliveryPerson deliveryPerson = deliveryPersonRepository.findOne(personId);
		
		if(deliveryPerson == null){
			throw new DeliveryPersonNotFound("DeliveryPerson is not found!");
		}
		
		deliveryPerson.setCurrentLocation(currentLocation);
		
		deliveryPersonRepository.save(deliveryPerson);
	}

	@Override
	public DeliveryPerson findDeliveryPersonById(String personId) {
		
		return deliveryPersonRepository.findOne(personId);
	}
	
	@Override
	public List<DeliveryPerson> getDeliveryPersonListForLocationAndRadius(CurrentLocation location, Double radius, Date lastUpdated) {
		
		Query query = new Query();
		
		GeoLocation geo = new GeoLocation(location.getLatitude(),location.getLongitude());
 
        GeoLocation[] boundingCoordinates = geo.boundingCoordinates(radius);

        Criteria locationCriteria= Criteria.where("currentLocation.latitude").gt(boundingCoordinates[0].getLatitudeInDegrees())
				.lt(boundingCoordinates[1].getLatitudeInDegrees())
				.and("currentLocation.longitude").gt(boundingCoordinates[0].getLongitudeInDegrees())
				.lt(boundingCoordinates[1].getLongitudeInDegrees());

        query.addCriteria(locationCriteria);
		
		return mongoTemplate.find(query, DeliveryPerson.class);

	}


}
