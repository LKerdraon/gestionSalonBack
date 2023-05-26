package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES", schema="gestion_salon_coiffure")
public class Role {
	
	//propriétés
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	
	private String libelleRole;

	
	//getters /setters
	
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getLibelleRole() {
		return libelleRole;
	}

	public void setLibelleRole(String libelleRole) {
		this.libelleRole = libelleRole;
	}

	//Constructeurs
	


	public Role() {
	}
	

	public Role(String libelleRole) {
		this.libelleRole = libelleRole;
	}


	//ToString
	


	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", LibelleRole=" + libelleRole + "]";
	}
	
	
	
	
}
