package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Salon;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long>{

}
