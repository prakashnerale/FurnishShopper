package com.furnish;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.furnish.config.SecurityUtility;
import com.furnish.domain.User;
import com.furnish.domain.security.Role;
import com.furnish.domain.security.UserRole;
import com.furnish.service.UserService;


@SpringBootApplication
public class FurnishShopperApplication implements CommandLineRunner  {
	
	@Autowired
	private UserService userService;

	

	public static void main(String[] args) {
		SpringApplication.run(FurnishShopperApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("prakash");
		user1.setLastName("chandra");
		user1.setUsername("p");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("prakashnc17@gmail.com");
		user1.setPhone("1234567891");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
		
		userRoles.clear();
		
		User user2 = new User();
		user2.setFirstName("Admin");
		user2.setLastName("Admin");
		user2.setUsername("a");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("a"));
		user2.setEmail("Admin@gmail.com");
		user2.setPhone("1234567891");
		Role role2 = new Role();
		role2.setRoleId(0);
		role2.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles);
	}
	
}
	
