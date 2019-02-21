package com.objis.demojsf.beans;

import java.util.Date;

public class User {
	
	private String prenom;
	private String nom;
	private String genre;
	private Date datedenaissance;
	private String email;
	private String niveaudeservice;
	
	
	public User(String prenom, String nom, String genre,String email, String niveaudeservice) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.email = email;
		this.niveaudeservice = niveaudeservice;
	}


	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public Date getDatedenaissance() {
		return datedenaissance;
	}



	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNiveaudeservice() {
		return niveaudeservice;
	}



	public void setNiveaudeservice(String niveaudeservice) {
		this.niveaudeservice = niveaudeservice;
	}
	
	

}
