package com.springmvc.action;
import javax.servlet.http.*;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.*;
public class HelloController implements Controller{
public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response)
throws Exception{
return new ModelAndView("success","message",greeting);
}
private String greeting;
public void setGreeting(String greeting){
this.greeting = greeting;
}
}