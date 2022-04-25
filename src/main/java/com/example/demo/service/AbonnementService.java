package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Abonnement;
import com.example.demo.models.Status;
import com.example.demo.models.User;
import com.example.demo.repositories.IAbonnementRepository;
import com.example.demo.repositories.IUserRepository;

@Service
public class AbonnementService implements IAbonnementService {
	@Autowired
	IAbonnementRepository abonnementRepo;
	
	@Autowired
	IUserRepository userRepo;

	
	public void addAbonnement(Abonnement a) {
		// TODO Auto-generated method stub
		a.setStatus(Status.PAYE);
		abonnementRepo.save(a);		
	}


	public void UpdateAbonnement(Abonnement a) {
		// TODO Auto-generated method stub
		abonnementRepo.save(a);	
	}


	public void DeleteAbonnemnent(int idAbonnement) {
		// TODO Auto-generated method stub
		abonnementRepo.deleteById(idAbonnement);
		
	}


	public List<Abonnement> GetAllAbonnement() {
		// TODO Auto-generated method stub
		 List<Abonnement> a =abonnementRepo.findAll();
		 return a;
	}
	
	public void getabonnbyuser(int idUser){
		User u = userRepo.findById(idUser).orElse(null);
		Set<Abonnement> abs = u.getAbonnement();
		Date d=new Date();
		for(Abonnement ab:abs) {
			if (ab.getDateExp().before(d) ) {ab.setStatus(Status.Non_PAYE);}
			abonnementRepo.save(ab);
		}
	}
	
	


	
}
