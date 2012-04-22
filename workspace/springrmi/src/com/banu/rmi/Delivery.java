package com.banu.rmi;

import java.io.Serializable;
import java.util.Date;

public class Delivery implements Serializable {
	private String requesterName;
    private Date deliveryDate;

    public Delivery(String requesterName, Date deliveryDate) {
        this.requesterName = requesterName;
        this.deliveryDate = deliveryDate;
    }

	public Delivery() {
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}
    
}
