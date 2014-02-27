package com.justdelivery.api.payload;

public class OrderPayload {

	private long orderId;
	public long getOrderId() {
		return orderId;
	}

	private String orderName;

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
