package com.banu.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");        
	     System.out.println("Server exposes RO...");
	}

}
