package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Abonnement;
import com.example.demo.models.Coach;
import com.example.demo.service.IAbonnementService;
//Abonnemnet//aadAbonnement
@RestController
@RequestMapping(value="Abonnemnet")
public class AbonnementController {
	@Autowired
	IAbonnementService abonnementServ;
	@PostMapping(value="/aadAbonnement")
	public void addAbommement(@RequestBody Abonnement a) {
		abonnementServ.addAbonnement(a);
	}
	@PutMapping(value="/upadteAbonnemnet")
	public void updateAbonnemnt(@RequestBody Abonnement a) {
		abonnementServ.UpdateAbonnement(a);
	}
	
	@DeleteMapping(value = "/deleteAbonnement/{idAbonnement}")
	public void deleteAbonnement(@PathVariable ("idAbonnement")int idAbonnement ) {
		abonnementServ.DeleteAbonnemnent(idAbonnement);	}
	
	@GetMapping(value = "/getabonnement")
	public List<Abonnement> GetAllAbonnement()
	{
		List<Abonnement> a =abonnementServ.GetAllAbonnement();
		return a;
    }
	@PutMapping("/VerifePayement/{id}")
	public void getabonnbyuser(@PathVariable("id") int idUser) {
		abonnementServ.getabonnbyuser(idUser);
	}
	
}
