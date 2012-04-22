package com.springmvc.action;

import javax.servlet.http.*;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.*;

public class HelloController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("outside: "+request.getParameter("hiddeninput"));
		if(!(request.getParameter("hiddeninput")==null)){
			System.out.println("inside: "+request.getParameter("hiddeninput"));
			return new ModelAndView("successAgain", "message", greeting);
		}
		else{
		return new ModelAndView("success", "message", greeting);
		}
	}

	private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}