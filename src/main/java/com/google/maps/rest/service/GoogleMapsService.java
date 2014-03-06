package com.google.maps.rest.service;

import com.justdelivery.api.model.google.DistanceMatrixResponse;

public interface GoogleMapsService {

	public DistanceMatrixResponse getDistanceMatrixResponseFromGoogle(String from, String to);
}
