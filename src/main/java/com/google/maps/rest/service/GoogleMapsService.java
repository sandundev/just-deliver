package com.google.maps.rest.service;

import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.google.distancematrix.DistanceMatrixResponse;

public interface GoogleMapsService {

	public DistanceMatrixResponse getDistanceMatrixResponseFromGoogle(String from, String to);
	
	public CurrentLocation getCurrentLocationForAddress(String address);
}
