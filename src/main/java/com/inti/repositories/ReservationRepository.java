package com.inti.repositories;

import org.springframework.stereotype.Repository;

import com.inti.entities.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
