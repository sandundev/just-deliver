package com.justdelivery.api.repository.person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.justdelivery.api.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> , CustomPersonRepository{
	
}
