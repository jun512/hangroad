package com.hangroad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hangroad.entity.User;
import com.hangroad.repository.UserRepository;
import com.hangroad.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
