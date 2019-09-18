package com.furnish.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.furnish.domain.User;
import com.furnish.repository.UserRepository;
@Service
public class UserSecurityService implements UserDetailsService {
	
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepository.findByUsername(username);
		if(null == user) {
			throw new UsernameNotFoundException("Username not found");
		}
		
		return user;
	}

}
