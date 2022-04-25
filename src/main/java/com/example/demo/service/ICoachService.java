package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Coach;

public interface ICoachService {
	 void addCoach(Coach c);
	
	 void UpdateCoach(Coach c);
	 
	 void DeleteCoach(int idCoach);
	 
	 List<Coach> GetAllCoach();

}
