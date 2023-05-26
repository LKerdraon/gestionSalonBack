package com.inti.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.inti.model.Adresse;

@Entity
@Table(name="SALONS", schema="gestion_salon_coiffure")
public class Salon {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalon;
	
	private String nomSalon;
	
	@Embedded
	private Adresse adresse;

	@ManyToOne
	private Reservation reservationSal;
	
	//getters /setters
	
	public Long getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}

	public String getNomSalon() {
		return nomSalon;
	}

	public void setNomSalon(String nomSalon) {
		this.nomSalon = nomSalon;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public Reservation getReservationSal() {
		return reservationSal;
	}

	public void setReservationSal(Reservation reservationSal) {
		this.reservationSal = reservationSal;
	}
	
	
	//Constructeurs


	public Salon() {
	}
	
	public Salon(String nomSalon, Adresse adresse) {
		this.nomSalon = nomSalon;
		this.adresse = adresse;
	}

	

	//ToString
	
	@Override
	public String toString() {
		return "Salon [idSalon=" + idSalon + ", nomSalon=" + nomSalon + ", adresse=" + adresse + "]";
	}
	
	
	
}
