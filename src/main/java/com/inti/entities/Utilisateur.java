package com.inti.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UTILISATEURS", schema="gestion_salon_coiffure")
public class Utilisateur {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	
	private String nomUtilisateur;
	
	private String prenomUtilisateur;
	
	private String loginUtilisateur;
	
	private String passwordUtilisateur;
	
	private String dateNaissance;

	@OneToMany(mappedBy="utilisateur")
	private List <Avis> lsavis = new ArrayList<>();
	
	@OneToMany(mappedBy="utilisateur")
	private List <Reservation> lsreservations =new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="Users_x_roles",
		joinColumns=@JoinColumn(name="User_id", referencedColumnName="idUtilisateur"),
		inverseJoinColumns=@JoinColumn(name="Role_id",referencedColumnName="idRole"))
	private Set<Role> lsrole=new HashSet<>();
	
	//getters /setters
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getLoginUtilisateur() {
		return loginUtilisateur;
	}

	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}

	public String getPasswordUtilisateur() {
		return passwordUtilisateur;
	}

	public void setPasswordUtilisateur(String passwordUtilisateur) {
		this.passwordUtilisateur = passwordUtilisateur;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	//Constructeurs
	
	public List<Avis> getLsavis() {
		return lsavis;
	}

	public void setLsavis(List<Avis> lsavis) {
		this.lsavis = lsavis;
	}

	public List<Reservation> getLsreservations() {
		return lsreservations;
	}

	public void setLsreservations(List<Reservation> lsreservations) {
		this.lsreservations = lsreservations;
	}

	public Set<Role> getLsrole() {
		return lsrole;
	}

	public void setLsrole(Set<Role> lsrole) {
		this.lsrole = lsrole;
	}

	public Utilisateur() {
	}
	
	


	//ToString
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur,
			String passwordUtilisateur, String dateNaissance, Set<Role> lsrole) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.loginUtilisateur = loginUtilisateur;
		this.passwordUtilisateur = passwordUtilisateur;
		this.dateNaissance = dateNaissance;
		this.lsrole = lsrole;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", loginUtilisateur=" + loginUtilisateur
				+ ", passwordUtilisateur=" + passwordUtilisateur + ", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
