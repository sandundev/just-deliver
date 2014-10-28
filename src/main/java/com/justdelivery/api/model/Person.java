package com.justdelivery.api.model;

import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	
	@Id
	private String id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Address address;
	private Boolean activeAccount;
	
	private Date registeredDate = new Date();
	
	private Location currentLocation;
	@DBRef
	private Set<GPSDevice> gpsDevices;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public Set<GPSDevice> getGpsDevices() {
		return gpsDevices;
	}
	public void setGpsDevices(Set<GPSDevice> gpsDevices) {
		this.gpsDevices = gpsDevices;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
	    this.password = password;
	}
	public Boolean getActiveAccount() {
	    return activeAccount;
	}
	public void setActiveAccount(Boolean activeAccount) {
	    this.activeAccount = activeAccount;
	}
	
	@Override
	public int hashCode() {

		return getId().hashCode();
	}

	@Override
	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}
	public Location getCurrentLocation() {
	    return currentLocation;
	}
	public void setCurrentLocation(Location currentLocation) {
	    this.currentLocation = currentLocation;
	}

}
