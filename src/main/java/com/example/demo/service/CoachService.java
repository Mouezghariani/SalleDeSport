package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Coach;
import com.example.demo.repositories.ICoachRepository;

@Service
public class CoachService implements ICoachService {
	@Autowired 
	ICoachRepository coachRepo;
	public void addCoach(Coach c) {
		coachRepo.save(c);
	}
	
	public void UpdateCoach(Coach c) {
		// TODO Auto-generated method stub
		coachRepo.save(c);
	}
	
	public void DeleteCoach(int idCoach) {
		// TODO Auto-generated method stub
		coachRepo.deleteById(idCoach);
	}
	
	public List<Coach> GetAllCoach() {
		// TODO Auto-generated method stub
		 List<Coach> c =coachRepo.findAll();
		 return c;
	}
		

}
