package com.justdelivery.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.justdelivery.api.model.Parcel;

@Repository
public interface ParcelRepository extends MongoRepository<Parcel, String>{

	  Parcel findByReferenceNumber(String referenceNumber);
}
