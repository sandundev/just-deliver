package com.justdelivery.api.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.justdelivery.api.model.core.DeliveryPerson;
import com.justdelivery.api.payload.OrderPayload;
import com.justdelivery.api.service.DeliveryPersonService;

@Path("/person")
@Component
public class DeliveryPersonEndPoint {
	
    private DeliveryPersonService deliveryPersonService;
    
	private UriInfo uriInfo;

	@PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createDeliveryPerson(DeliveryPerson deliveryPerson){
    	
		String id = deliveryPersonService.registerDeliveryPerson(deliveryPerson);

		return Response.created(uriInfo.getAbsolutePathBuilder().path("{id}").build(id)).build();
		 
	}
	@GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getNearByOrder(){
    	
		OrderPayload order = new OrderPayload();
		order.setOrderId(123L);
		order.setOrderName("First Order");
		return Response.ok(order).build();
		 
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
