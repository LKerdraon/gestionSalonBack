package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
