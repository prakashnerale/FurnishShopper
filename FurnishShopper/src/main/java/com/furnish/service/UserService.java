package com.furnish.service;

import java.util.Set;
import com.furnish.domain.User;
import com.furnish.domain.security.UserRole;



public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);

}
