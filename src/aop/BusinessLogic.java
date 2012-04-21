package aop;
public class BusinessLogic implements IBusinessLogic
{
     public void foo() 
     {
       System.out.println("Inside BusinessLogic.foo()");
     }
     
     public void bar() throws BusinessLogicException
     {
        System.out.println("Inside BusinessLogic.bar()");
        throw new BusinessLogicException();
     }
}
