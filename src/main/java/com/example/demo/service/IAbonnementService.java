package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Abonnement;

public interface IAbonnementService {
	void addAbonnement(Abonnement a);
	
	 void UpdateAbonnement(Abonnement a);
	 
	 void DeleteAbonnemnent (int idAbonnement);
	 
	 List<Abonnement> GetAllAbonnement();
	 void getabonnbyuser(int idUser);

}
