package com.zied.film.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zied.film.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);

}
