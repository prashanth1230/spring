package com.banu.rmi;

import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caucho.hessian.client.HessianProxyFactory;

public class RmiClient {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("com/banu/rmi/app.xml");        
	        DeliveryServiceIntf deliveryService = (DeliveryServiceIntf) ctx.getBean("deliveryService");
	        
		
	/*	HessianProxyFactory factory = new HessianProxyFactory();
		String url = "http://localhost:1234/delivery-service";
		url ="http://localhost:1234/remoting/MyService";
		DeliveryServiceIntf deliveryService = (DeliveryServiceIntf)factory.create( DeliveryServiceIntf.class,url);
		
	*/	 deliveryService.newDelivery(new Delivery("Rajesh", new Date()));
        deliveryService.newDelivery(new Delivery("Rahul", new Date()));
        deliveryService.newDelivery(new Delivery("Kavitha", new Date()));
        deliveryService.newDelivery(new Delivery("Karthik", new Date()));
        
       List d =  deliveryService.getDeliveries();
        for(int i = 0; i < d.size(); i++)
        {
        	Delivery delivery = (Delivery) d.get(i);
        	System.out.println(delivery.getRequesterName());
        	System.out.println(delivery.getDeliveryDate());
        } 
        System.out.println(deliveryService);
		
	}

}
