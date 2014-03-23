package com.justdelivery.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justdelivery.api.model.core.LocalBusiness;

@Repository
public interface LocalBusinessDao extends CrudRepository<LocalBusiness, String> {

}
