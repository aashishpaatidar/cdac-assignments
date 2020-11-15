package com.flight.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.pojo.User;
import com.flight.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User authenticateUser(String email, String password) {
		
		return userRepo.findByEmailAndPassword(email, password);
	}

	@Override
	public User saveUserDetails(User u) {
		
		return userRepo.save(u);
	}

}
