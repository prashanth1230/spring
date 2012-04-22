package com.spring.service;

import com.spring.domain.User;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		System.out.println("User added successfully");

	}

}
