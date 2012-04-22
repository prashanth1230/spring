package com.banu.rmi;

import java.util.List;

public interface DeliveryServiceIntf {
	void newDelivery(Delivery delivery);

    List getDeliveries();
}
