package com.inti.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private String nomRue;
	
	@Column(length=5)
	private String codePostal;
	
	private String ville;

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Adresse(String nomRue, String codePostal, String ville) {
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [nomRue=" + nomRue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	
	
}
