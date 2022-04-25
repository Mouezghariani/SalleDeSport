package com.example.demo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;

@Entity
public class Abonnement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int id;
	private String nom;
	private double cout;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone="Europe/Zagreb")
	@Column(columnDefinition = "date_exp")
	private Date DateExp;
	
	
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
	public Abonnement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Abonnement() {
		super();
	}
	
	@ManyToOne
	private User users;
	
	@JsonIgnore
	@OneToMany
	private Set <Planning> plannings;
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Set<Planning> getPlannings() {
		return plannings;
	}
	public void setPlannings(Set<Planning> plannings) {
		this.plannings = plannings;
	}
	public Abonnement(User users, Set<Planning> plannings) {
		super();
		this.users = users;
		this.plannings = plannings;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getDateExp() {
		return DateExp;
	}
	public void setDateExp(Date dateExp) {
		DateExp = dateExp;
	}
	

}
