package com.justdelivery.api.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.justdelivery.api.payload.OrderPayload;
import com.justdelivery.api.service.LocalBusinessService;

@Path("/business")
@Component
public class LocalBusinessEndPoint {
	
    private LocalBusinessService localBusinessService;
    
	private UriInfo uriInfo;

	@GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getNearByOrder(){
    	
		OrderPayload order = new OrderPayload();
		order.setOrderId(123L);
		order.setOrderName("First Order");
		return Response.ok(order).build();
		 
	}

	@Autowired
	public void setLocalBusinessService(LocalBusinessService localBusinessService) {
		
		this.localBusinessService = localBusinessService;
	}
	
	@Autowired
	public void setUriInfo(UriInfo uriInfo) {
	
		this.uriInfo = uriInfo;
		
	}
}
