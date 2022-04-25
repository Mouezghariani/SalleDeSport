package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Coach;
import com.example.demo.service.ICoachService;


@CrossOrigin()
@RestController
@RequestMapping(value = "Coach")
public class CoachController {
	@Autowired
	ICoachService coachServ ;
	@PostMapping(value = "/addCoach")
	public void addCaoch(@RequestBody Coach c) {
		coachServ.addCoach(c);	
	}
	
	@PutMapping(value = "/updateCoach")
	public void updateCoach(@RequestBody Coach c) {
		coachServ.UpdateCoach(c);
	}
	
	@DeleteMapping(value = "/deleteCoach/{idC}")
	public void deleteCoach (@PathVariable("idC")int idCoach) {
		coachServ.DeleteCoach(idCoach);
	}
	@GetMapping(value = "/getCoach")
	public List<Coach> GetAllCoach()
	{
		List<Coach> c =coachServ.GetAllCoach();
		return c;
	
	}

}
