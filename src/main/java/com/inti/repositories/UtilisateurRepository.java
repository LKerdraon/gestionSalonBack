package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
