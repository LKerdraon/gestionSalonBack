package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Avis;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{

}
