package com.rajesh.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rajesh.domain.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"password.required");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required");
		ValidationUtils.rejectIfEmpty(errors, "country", "country.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "aboutYou",
				"aboutYou.required");
		User user = (User) target;
		if (user.getCommunity().length == 0) {
			errors.rejectValue("community", "community.required");
		}
	}

}
