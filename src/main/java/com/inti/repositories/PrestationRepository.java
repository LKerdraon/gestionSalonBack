package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Prestation;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PrestationRepository extends JpaRepository<Prestation, Long>{

}
