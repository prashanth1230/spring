package com.springmvc.action;

import javax.servlet.http.*;
//import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.*;

@Controller
@RequestMapping("/*")
public class HelloController {

	@RequestMapping("/submitAction.htm")
	public ModelAndView handleRequest() {

		String status = "success";

		return new ModelAndView(status, "message", "registration successful");
	}

}