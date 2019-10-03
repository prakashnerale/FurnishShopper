package com.furnish.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	private static final long serialVersionUID=1234678;//some random Number
	@Id
	private int roleId;
	private String name;
	private Set<UserRole> userRole= new HashSet<>();
	
   public Role() {}

public int getRoleId() {
	return roleId;
}

public void setRoleId(int roleId) {
	this.roleId = roleId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<UserRole> getUserRole() {
	return userRole;
}

public void setUserRole(Set<UserRole> userRole) {
	this.userRole = userRole;
}
   
   
}
