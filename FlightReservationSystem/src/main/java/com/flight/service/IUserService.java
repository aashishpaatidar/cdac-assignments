package com.flight.service;

import com.flight.pojo.User;

public interface IUserService {

	User authenticateUser(String email, String password);
	
	User saveUserDetails(User u);
}
