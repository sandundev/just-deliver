package com.justdelivery.api.endpoint;

import javax.ws.rs.core.UriInfo;

import org.junit.BeforeClass;
import org.junit.Test;

import com.justdelivery.api.service.LocalBusinessService;

import static org.mockito.Mockito.*;


public class LocalBusinessEndPointTest {

	LocalBusinessEndPoint businessEndPoint;
	
	UriInfo uriInfo;
	
	LocalBusinessService localBusinessService;
	
	@BeforeClass
	public void setup() {
		
		businessEndPoint= new LocalBusinessEndPoint();
		uriInfo  = mock(UriInfo.class);
		localBusinessService = mock(LocalBusinessService.class);
		
		businessEndPoint.setLocalBusinessService(localBusinessService);
		businessEndPoint.setUriInfo(uriInfo);
	}
	
	@Test
	public void shouldCreateLocalBusinessProfile(){

		//TODO:
	}

}
