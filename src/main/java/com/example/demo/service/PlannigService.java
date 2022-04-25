package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Planning;
import com.example.demo.repositories.IPlannigRepository;
@Service
public class PlannigService implements IPlannigService{

	@Autowired	
	IPlannigRepository planRepo;

	public void addPlanning(Planning p) {
		// TODO Auto-generated method stub
		planRepo.save(p);
		
	}


	public void UpdatePlanning(Planning p) {
		// TODO Auto-generated method stub
		planRepo.save(p);
	}


	public void DeletePlanning(int idPlanning) {
		// TODO Auto-generated method stub
		planRepo.deleteById(idPlanning);
	}

	@Override
	public List<Planning> GetAllPlanning() {
		// TODO Auto-generated method stub
		List<Planning> p=planRepo.findAll();
		return p;
	}

}
