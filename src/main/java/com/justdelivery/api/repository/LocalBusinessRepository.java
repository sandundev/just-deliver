package com.justdelivery.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justdelivery.api.model.core.LocalBusiness;

@Repository
public interface LocalBusinessRepository extends CrudRepository<LocalBusiness, String> {

}
