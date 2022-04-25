package com.example.demo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String nom;
	private String prenom;
	private String adresse;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="Europe/Zagreb")
	private Date date_naissance;
	
	private String email;
	private int cin;
	private int numtel;
	//////
	private boolean enabled;

	
	//user name mdp///
	private String username;
//	@Column(name = "mdp")
	private String mdp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public int getNumtel() {
		return numtel;
	}
	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public User(int id, String nom, String prenom, String adresse, Date date_naissance, String email, int cin,
			int numtel,String username, String mdp) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.date_naissance = date_naissance;
		this.email = email;
		this.cin = cin;
		this.numtel = numtel;
		this.username = username;
		this.mdp = mdp;
	}
	public User() {
		super();
	}
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}	
	@JsonIgnore
	@OneToMany(mappedBy = "users")
	private Set< Abonnement> abonnement;
	
	
	@ManyToMany(mappedBy = "user")
	private Set<Role> role;
	
	
	public Set<Role> getRole() {
		// TODO Auto-generated method stub
		return role;
	}
	public Set<Abonnement> getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Set<Abonnement> abonnement) {
		this.abonnement = abonnement;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	public User(String username) {
		super();
		this.username = username;
	}
	
	
	

}
