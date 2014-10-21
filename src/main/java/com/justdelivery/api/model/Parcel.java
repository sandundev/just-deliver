package com.justdelivery.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
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
	
	private Location senderLocation;
	
	private Location receiverLocation;

	@Indexed
	private Location lastLocation;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Location getSenderLocation() {
		return senderLocation;
	}

	public void setSenderLocation(Location senderLocation) {
		this.senderLocation = senderLocation;
	}

	public Location getReceiverLocation() {
		return receiverLocation;
	}

	public void setReceiverLocation(Location receiverLocation) {
		this.receiverLocation = receiverLocation;
	}

	public Location getLastLocation() {
		return lastLocation;
	}

	public void setLastLocation(Location lastLocation) {
		this.lastLocation = lastLocation;
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
}
