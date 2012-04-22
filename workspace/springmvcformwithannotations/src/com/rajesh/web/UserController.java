package com.rajesh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rajesh.domain.User;
import com.rajesh.service.UserService;
import com.rajesh.validator.UserValidator;

@Controller
@RequestMapping("/userRegistration.htm")
@SessionAttributes("user")
public class UserController {

	private UserService userService;
	private UserValidator userValidator;

	@Autowired
	public UserController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user") User user,
			BindingResult result) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "userForm";
		} else {
			userService.add(user);
			return "redirect:userSuccess.htm";
		}
	}

}
