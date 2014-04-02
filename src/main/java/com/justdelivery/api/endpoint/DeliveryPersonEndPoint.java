package com.justdelivery.api.endpoint;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.justdelivery.api.exception.DeliveryPersonNotFound;
import com.justdelivery.api.model.core.CurrentLocation;
import com.justdelivery.api.model.core.DeliveryPerson;
import com.justdelivery.api.service.DeliveryPersonService;
/**
 * 
 * @author Sandun
 *
 */
@Path("/person")
@Component
public class DeliveryPersonEndPoint {
	
    private DeliveryPersonService deliveryPersonService;
    
	private UriInfo uriInfo;

	@PUT
    @Path("/create/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createDeliveryPerson(DeliveryPerson deliveryPerson){
    	
		DeliveryPerson newDeliveryPerson = deliveryPersonService.createDeliveryPerson(deliveryPerson);

		return Response.created(uriInfo.getAbsolutePathBuilder().path("{id}").build(newDeliveryPerson.getId())).build();
		 
	}
	
    @POST
    @Path("/location/update/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateCurrentLocationForDeliveryPerson(@PathParam("id") String personId,  CurrentLocation currentLocation) throws DeliveryPersonNotFound{
    	
		deliveryPersonService.updateCurrentLocationForDeliveryPerson(personId, currentLocation);

		return Response.ok().build();
		 
	}
	
    @POST
    @Path("/list/{radius}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getDeliveryPersonListForLocationAndRadius(@PathParam("radius")  Double radius, CurrentLocation location) throws DeliveryPersonNotFound{
    	
		List<DeliveryPerson> matchingPersonList = deliveryPersonService.getDeliveryPersonListForLocationAndRadius(location, radius, new Date());
		
		GenericEntity<List<DeliveryPerson>> entity = new GenericEntity<List<DeliveryPerson>>(matchingPersonList){};
	    
		return Response.ok(entity).build();
		 
	}
    
	@Autowired
	public void setDeliveryPersonService(DeliveryPersonService deliveryPersonService) {
		this.deliveryPersonService = deliveryPersonService;
	}
	
    @Context
	public void setUriInfo(UriInfo uriInfo) {
		this.uriInfo = uriInfo;
		
	}


}
