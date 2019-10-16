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
		user1.setFirstName("Admin");
		user1.setLastName("Admin");
		user1.setUsername("admin");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("a"));
		user1.setEmail("Admin@gmail.com");
		user1.setPhone("1134567891");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
		
        userService.createUser(user1, userRoles);
		
		userRoles.clear();
		
		
		User user2 = new User();
		user2.setFirstName("prakash");
		user2.setLastName("chandra");
		user2.setUsername("prakash");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user2.setEmail("prakashnc17@gmail.com");
		user2.setPhone("2234567892");
		Role role2 = new Role();
		role2.setRoleId(2);
		role2.setName("ROLE_USER");
		userRoles.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles);
			
		
	}
	
}
	
