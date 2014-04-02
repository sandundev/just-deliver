package com.justdelivery.api.endpoint;

import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import com.justdelivery.api.model.core.LocalBusiness;
import com.justdelivery.api.service.LocalBusinessService;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LocalBusinessEndPointTest {

	private LocalBusinessEndPoint businessEndPoint;
	
	private UriInfo uriInfo;
	
	private LocalBusinessService localBusinessService;
	
	@Before
	public void setup() {
		
		businessEndPoint= new LocalBusinessEndPoint();
		uriInfo  = mock(UriInfo.class);
		localBusinessService = mock(LocalBusinessService.class);
		
		businessEndPoint.setLocalBusinessService(localBusinessService);
		businessEndPoint.setUriInfo(uriInfo);
	}
	
	@Test
	public void shouldCreateLocalBusinessProfile(){

		LocalBusiness localBusiness = new LocalBusiness();
		
		localBusiness.setAddress("Address_"+1);
		localBusiness.setBusinessName("Nandos Kingsbury");
		localBusiness.setEmailAddress("sandun.lewke@gmail.com");
		localBusiness.setFirstContact("first contact person");
		localBusiness.setPostCode("nw2 1sd");
		localBusiness.setRegistrationDate(new Date());
		localBusiness.setTelephone("07914421999");
		
		when(localBusinessService.createLocalBusiness(localBusiness)).thenReturn(localBusiness);
		when(uriInfo.getAbsolutePathBuilder()).thenReturn(UriBuilder.fromPath("http://localhost:8080/base_url/"));
		
		Response response = businessEndPoint.createLocalBusiness(localBusiness);
		
		assertThat(response.getLocation().toString(), is("http://localhost:8080/base_url/test_ID"));
		assertThat(response.getStatus(), is(HttpStatus.CREATED.value()));
 
	        
	}

}
