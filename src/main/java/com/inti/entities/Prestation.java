package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRESTATIONS", schema="gestion_salon_coiffure")
public class Prestation {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	
	private String nomPrestation;
	
	@ManyToOne
	private Reservation reservationPrest;
	
	
	//getters /setters
	
	public Reservation getReservationPrest() {
		return reservationPrest;
	}
	public void setReservationPrest(Reservation reservationPrest) {
		this.reservationPrest = reservationPrest;
	}
	public Long getIdPrestation() {
		return idPrestation;
	}
	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}
	public String getNomPrestation() {
		return nomPrestation;
	}
	public void setNomPrestation(String nomPrestation) {
		this.nomPrestation = nomPrestation;
	}
	
	//Constructeurs
	
	public Prestation() {
	}
	
	public Prestation(String nomPrestation) {
		this.nomPrestation = nomPrestation;
	}
	
	

	//ToString
	
	@Override
	public String toString() {
		return "Prestation [idPrestation=" + idPrestation + ", nomPrestation=" + nomPrestation + "]";
	}
	
	
}
