package com.spring;

public class CommandLineView1 
{
   private RentABike rentaBike;
   public CommandLineView1() 
{
}

   public void setRentABike(RentABike rentaBike) 
   {
      this.rentaBike = rentaBike;
   }

   public RentABike getRentABike() { return this.rentaBike; }

   public void printAllBikes() {
      rentaBike.StoreName();
      }

     public static final void main(String[] args) {
      CommandLineView1 clv = new CommandLineView1();
      RentABike rentaBike = new ArrayListRentABike();
      clv.setRentABike(rentaBike);
      clv.printAllBikes();
   }

   
}
