package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AVIS", schema="gestion_salon_coiffure")
public class Avis {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	
	private String titreAvis;
	
	private String descriptionAvis;
	
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	
	
	//getters /setters
	
	public Long getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}
	public String getTitreAvis() {
		return titreAvis;
	}
	public void setTitreAvis(String titreAvis) {
		this.titreAvis = titreAvis;
	}
	public String getDescriptionAvis() {
		return descriptionAvis;
	}
	public void setDescriptionAvis(String descriptionAvis) {
		this.descriptionAvis = descriptionAvis;
	}
	
	
	//Constructeurs
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Avis() {
	}
	
	public Avis(String titreAvis, String descriptionAvis,Utilisateur utilisateur) {
		this.titreAvis = titreAvis;
		this.descriptionAvis = descriptionAvis;
		this.utilisateur=utilisateur;
	}
	
	

	//ToString
	
	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titreAvis=" + titreAvis + ", descriptionAvis=" + descriptionAvis + "]";
	}
	
	
	
	
}
