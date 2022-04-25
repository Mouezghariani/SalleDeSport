package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IEmailServicelmpl;
import com.example.demo.service.IUserService;
import com.example.demo.models.Abonnement;
import com.example.demo.models.Status;
import com.example.demo.models.User;
import com.example.demo.repositories.IAbonnementRepository;
import com.example.demo.service.EmailServiceImpl;
import com.example.demo.service.IAbonnementService;
@RestController
/*@RequestMapping("Admin")*/
public class SendEmailController {
	@Autowired
	IEmailServicelmpl emailserv;
	@Autowired
	IUserService userserv;
	@Autowired
	IAbonnementService absserv;
	
	@RequestMapping(value = "/SendMail")
	public void sendmail()
	{
	List<Abonnement> abs =	absserv.GetAllAbonnement();

	for(Abonnement ab:abs) {	
		{
			if(ab.getStatus()==Status.Non_PAYE)
			{
		
			String ch="Bonjour Mr/Mme "+ab.getUsers().getNom() +" " +ab.getUsers().getPrenom()+".\nVotre abonnement de  "+ab.getNom()+" a expiré .Veuillez s'il vous plait payer la séance prochaine .\n Merci pour votre fidilité . ";		
				emailserv.sendSimpleMessage(	ab.getUsers().getEmail()	,"PAIEMENT ", ch);
		  }
	}
		
		
	}

}
	}
