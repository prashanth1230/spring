package com.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommandLineView
 {
  
 private RentABike rentaBike;
  
 public CommandLineView() {}


   public void setRentaBike(RentABike rentaBike)
 {
 
     this.rentaBike = rentaBike;
   
}

 
  public RentABike getRentaBike() 
{ 
return this.rentaBike; 
}

 
  public void printAllBikes() 
{
 
    rentaBike.StoreName();
 
  }   
  
 public static final void main(String[] args)
 {
	    
  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("RentABike-context.xml");
	 
     CommandLineView clv = (CommandLineView)ctx.getBean("commandLineView1");
	  
    clv.printAllBikes();

	   }
}
