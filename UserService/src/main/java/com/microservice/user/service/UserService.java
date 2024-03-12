package com.microservice.user.service;

import java.util.List;

import com.microservice.user.entity.User;

public interface UserService {

	// user operation

	// create
	User saveUser(User user);

	// get all user
	List<User> getAllUser();

	// get single user of given userId
	User getUser(String userId);

	// delet
	String deleteUserId(String userId);

	// update
	// User updateUserById(String userId);
}