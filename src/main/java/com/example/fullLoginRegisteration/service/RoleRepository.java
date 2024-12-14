package com.example.fullLoginRegisteration.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullLoginRegisteration.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}

