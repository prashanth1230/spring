package aop;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class TracingBeforeAdvice implements MethodBeforeAdvice
{
   public void before(Method m, Object[] args, Object target) throws Throwable
   {
      System.out.println("Hello world! (by " + this.getClass().getName() + ")");
   }
} 
 