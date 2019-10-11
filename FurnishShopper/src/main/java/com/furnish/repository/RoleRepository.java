package com.furnish.repository;

import org.springframework.data.repository.CrudRepository;

import com.furnish.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
