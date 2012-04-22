package com.banu.rmi;

import java.util.ArrayList;
import java.util.List;

public class DeliveryServiceImpl implements DeliveryServiceIntf {

	private List deliveries = new ArrayList();

    public void newDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    public List getDeliveries() {
        return deliveries;
    }

}
