package com.rajesh.service;

import com.rajesh.domain.User;

import com.rajesh.data.DataStuff;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		XmlBeanFactory ctx;
		ctx = new XmlBeanFactory(new ClassPathResource("dataAccessContext.xml"));
		DataStuff test = (DataStuff) ctx.getBean("dataStuff");
		test.setNames(user);
		System.out.println("User added successfully");

	}

}
