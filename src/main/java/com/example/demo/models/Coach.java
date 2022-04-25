package com.example.demo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import javax.persistence.Id;
@Entity
public class Coach {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int id;
	private String nom;
	private int numtel_co;
	private String email;
	@Enumerated(EnumType.STRING)
	private Specialite specialite;
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public Set<Planning> getPlannings() {
		return plannings;
	}
	public void setPlannings(Set<Planning> plannings) {
		this.plannings = plannings;
	}
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
	public int getNumtel_co() {
		return numtel_co;
	}
	public void setNumtel_co(int numtel_co) {
		this.numtel_co = numtel_co;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Coach(int id, String nom, int numtel_co, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.numtel_co = numtel_co;
		this.email = email;
	}
	public Coach() {
		super();
	}
	
	@OneToMany
	private Set<Planning>plannings;
	
	
	

}
