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

import com.justdelivery.api.model.core.LocalBusiness;
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
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createLocalBusiness(LocalBusiness localBusiness){
		
			LocalBusiness business = localBusinessService.createLocalBusiness(localBusiness);
			
			return Response.created(uriInfo.getAbsolutePathBuilder().path("{id}").build(business.getId())).build();
	}

	@Autowired
	public void setLocalBusinessService(LocalBusinessService localBusinessService) {
		
		this.localBusinessService = localBusinessService;
	}
	
    @Context
	public void setUriInfo(UriInfo uriInfo) {
	
		this.uriInfo = uriInfo;
		
	}
}
