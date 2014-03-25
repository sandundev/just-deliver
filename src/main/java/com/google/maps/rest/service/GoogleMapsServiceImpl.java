package com.google.maps.rest.service;

import javax.ws.rs.core.MediaType;

import com.justdelivery.api.model.google.DistanceMatrixResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class GoogleMapsServiceImpl implements GoogleMapsService {

	@Override
	public DistanceMatrixResponse getDistanceMatrixResponseFromGoogle(String from, String to) {
		
		 	ClientConfig config = new DefaultClientConfig();
		    Client client = Client.create(config);
		    WebResource service = client.resource(getBaseURI());
		    
		    return service.path("xml").queryParam("origins", from).queryParam("destinations", to).queryParam("sensor", "false").accept(MediaType.TEXT_XML).get(DistanceMatrixResponse.class);
	}

	public static void main(String[] args) {
		DistanceMatrixResponse  distanceResponse = new GoogleMapsServiceImpl().getDistanceMatrixResponseFromGoogle("51.529855,-0.123889","57.178073, -2.173265");
		System.out.println(distanceResponse.getOriginAddress());
		System.out.println(distanceResponse.getRow().getElement().get(0).getDuration().getValue());
	}
	private String getBaseURI() {
	 
		return "http://maps.googleapis.com/maps/api/distancematrix/";
	}

}
