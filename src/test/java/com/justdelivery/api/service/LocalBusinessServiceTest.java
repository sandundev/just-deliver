package com.justdelivery.api.service;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.justdelivery.api.model.core.LocalBusiness;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
       "classpath:spring-config.xml"
})
public class LocalBusinessServiceTest {

	private LocalBusinessService localBusinessService;
	
	@Before
	public void setup(){ 
	}
	
	@Test
	public void shouldSaveLocalBusiness() {
		LocalBusiness localBusiness = getTestLocalBusiness();
		localBusinessService.registerLocalBusiness(localBusiness);
	}

	private LocalBusiness getTestLocalBusiness() {
		LocalBusiness localBusiness = new LocalBusiness();
		
		localBusiness.setAddress("Address_"+1);
		localBusiness.setBusinessName("Nandos Kingsbury");
		localBusiness.setEmailAddress("sandun.lewke@gmail.com");
		localBusiness.setFirstContact("first contact person");
		localBusiness.setPostCode("nw2 1sd");
		localBusiness.setRegistrationDate(new Date());
		localBusiness.setTelephone("07914421999");
		return localBusiness;
	}

	@Autowired
	public void setLocalBusinessService(LocalBusinessService localBusinessService) {
		this.localBusinessService = localBusinessService;
	}

}
