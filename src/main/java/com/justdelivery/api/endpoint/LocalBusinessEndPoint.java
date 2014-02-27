package com.justdelivery.api.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.justdelivery.api.payload.OrderPayload;

@Path("/business")
@Component
public class LocalBusinessEndPoint {
	
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getNearByOrder(){
    	
		OrderPayload order = new OrderPayload();
		order.setOrderId(123L);
		order.setOrderName("First Order");
		return Response.ok(order).build();
		 
	}
}
