package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Planning;

public interface IPlannigService {
	void addPlanning(Planning p);
	
	void UpdatePlanning(Planning p);
	
	void DeletePlanning(int idPlanning);
	
	List<Planning> GetAllPlanning();

}
