package com.justdelivery.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@CompoundIndexes({
	  @CompoundIndex(name = "ref_location", def = "{'referenceNumber': 1, 'lastLocation': 1}"),
	  @CompoundIndex(name = "ref_number", def = "{'referenceNumber': 1}")
})
@Document
public class Parcel {
	
	@Id
	private String id;
	
	@Indexed
	private String referenceNumber;
	
	private String barCode;
	
	@DBRef
	private ParcelSender parcelSender;

	@DBRef
	private ParcelReceiver parcelReceiver;

	private Boolean deliveryStatus;

	@Indexed
	private Location currentLocation;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getId() {
		return id;
	}

	public String getBarCode() {
	    return barCode;
	}

	public void setBarCode(String barCode) {
	    this.barCode = barCode;
	}

	public ParcelSender getParcelSender() {
	    return parcelSender;
	}

	public void setParcelSender(ParcelSender parcelSender) {
	    this.parcelSender = parcelSender;
	}

	public ParcelReceiver getParcelReceiver() {
	    return parcelReceiver;
	}

	public void setParcelReceiver(ParcelReceiver parcelReceiver) {
	    this.parcelReceiver = parcelReceiver;
	}

	public Boolean getDeliveryStatus() {
	    return deliveryStatus;
	}

	public void setDeliveryStatus(Boolean deliveryStatus) {
	    this.deliveryStatus = deliveryStatus;
	}

	public Location getCurrentLocation() {
	    return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
	    this.currentLocation = currentLocation;
	}
}
