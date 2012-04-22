package com.banu.rmi;

import java.rmi.Naming;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiClientOld {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{
	     System.out.println(Naming.lookup("rmi://localhost:1234/delivery-service"));
			DeliveryServiceIntf deliveryService = (DeliveryServiceIntf) Naming.lookup("rmi://localhost:1234/delivery-service");
	        deliveryService.newDelivery(new Delivery("Jack Sparrow", new Date()));
	             List d =  deliveryService.getDeliveries();
	        for(int i = 0; i < d.size(); i++)
	        {
	        	Delivery delivery = (Delivery) d.get(i);
	        	System.out.println(delivery.getRequesterName());
	        	System.out.println(delivery.getDeliveryDate());
	        }
	        System.out.println();
	}

}
