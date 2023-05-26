package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="RESERVATIONS", schema="gestion_salon_coiffure")
public class Reservation {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	
	@Temporal(value = TemporalType.DATE)
	private Date dateReservation;

	 @OneToMany(mappedBy="reservationSal")
	 private List<Salon> lssalons = new ArrayList <>();

	 @OneToMany(mappedBy="reservationPrest")
	 private List<Prestation> lsprestations = new ArrayList <>();

	 @ManyToOne
	 @JoinColumn(name="utilisateur_id")
	 private Utilisateur utilisateur;
	 
	//getters /setters
	
	public List<Salon> getLssalons() {
		return lssalons;
	}

	public void setLssalons(List<Salon> lssalons) {
		this.lssalons = lssalons;
	}

	public List<Prestation> getLsprestations() {
		return lsprestations;
	}

	public void setLsprestations(List<Prestation> lsprestations) {
		this.lsprestations = lsprestations;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	
	
	//Constructeurs
	
	public Reservation() {
	}
	
	public Reservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	

	//ToString
	
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation + "]";
	}
	
	
	
}
