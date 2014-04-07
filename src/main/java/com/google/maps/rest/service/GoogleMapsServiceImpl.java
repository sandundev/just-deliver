package com.google.maps.rest.service;

import javax.ws.rs.core.MediaType;

import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.google.distancematrix.DistanceMatrixResponse;
import com.justdelivery.api.model.google.geocoding.GeocodingResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class GoogleMapsServiceImpl implements GoogleMapsService {

	@Override
	public DistanceMatrixResponse getDistanceMatrixResponseFromGoogle(String from, String to) {
		
		 	WebResource service = getGoogleService();
		    
		    return service.path("distancematrix/xml").queryParam("origins", from).queryParam("destinations", to).queryParam("sensor", "false").accept(MediaType.TEXT_XML).get(DistanceMatrixResponse.class);
	}

	private WebResource getGoogleService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		return service;
	}

	public static void main(String[] args) {
		DistanceMatrixResponse  distanceResponse = new GoogleMapsServiceImpl().getDistanceMatrixResponseFromGoogle("51.529855,-0.123889","57.178073, -2.173265");
		System.out.println(distanceResponse.getOriginAddress());
		 
		System.out.println(distanceResponse.getRow().getElement().get(0).getDuration().getValue());
		
		CurrentLocation  location = new GoogleMapsServiceImpl().getCurrentLocationForAddress("12 st james road,  cr4 2da , uk");
		System.out.println(location.getLatitude());
		  
	}
	private String getBaseURI() {
	 
		return "http://maps.googleapis.com/maps/api/";
	}

	@Override
	public CurrentLocation getCurrentLocationForAddress(String address) {
	 	WebResource service = getGoogleService();
	 	GeocodingResponse geoCode = service.path("geocode/json").queryParam("address", address).queryParam("sensor", "false").accept(MediaType.TEXT_XML).get(GeocodingResponse.class);
	 	CurrentLocation location = new CurrentLocation();
	 	location.setLatitude((double) geoCode.getResults().getGeometry().getLocation().getLat());
	 	location.setLongitude((double) geoCode.getResults().getGeometry().getLocation().getLng());
	 	
	 	return location;
	}

}
