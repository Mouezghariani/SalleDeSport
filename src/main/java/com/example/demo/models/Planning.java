package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;


import javax.persistence.Id;

@Entity
public class Planning {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Planning(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	public Planning() {
		super();
	}
	
	@ManyToOne
	private Abonnement abonnement;
	
	@ManyToOne
	private Coach coach;
}
