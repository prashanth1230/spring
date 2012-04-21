package com.spring.constructor;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommandLineView
 {
  
 private RentABike rentaBike;
  
 public CommandLineView(RentABike rentaBike2) {
	 this.rentaBike = rentaBike2;
	 
 }


 
  public void printAllBikes() 
{
 
    rentaBike.StoreName();
 
  }   
  
 public static final void main(String[] args)
 {
	    
  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("RentABike-context.xml");
	 
     CommandLineView clv = (CommandLineView)ctx.getBean("commandLineView3");
	  
    clv.printAllBikes();

	   }
}
