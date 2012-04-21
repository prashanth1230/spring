package aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication
{
   public static void main(String [] args)
   {
      // Read the configuration file
	   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig1.xml");

      //Instantiate an object
      IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("businesslogicbean");

      //Execute the public methods of the bean
      testObject.foo();

      try
      {
         testObject.bar();
      }
      catch(BusinessLogicException ble)
      {
         System.out.println("Caught BusinessLogicException");
      }
   }
}
