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
import com.example.demo.models.Planning;
import com.example.demo.service.IPlannigService;

@RestController
@RequestMapping("Planning")
public class PlanningController {
	@Autowired
	IPlannigService planServ;
	
	@PostMapping(value = "/addPlanning")
	public void addPlannnig(@RequestBody Planning p) {
		planServ.addPlanning(p);
	}
	@PutMapping(value="/updatePlanning")
	public void UpdatePlanning(@RequestBody Planning p) {
		planServ.UpdatePlanning(p);
	}
	
	@DeleteMapping(value = "/DeletePlanning/{idPlan}")
	public void DeletePlanning(@PathVariable("idPlan")int idPlanning)
	{
		planServ.DeletePlanning(idPlanning);
	}
	
	@GetMapping(value = "/getPlanning")
	public List<Planning> GetAllRole()
	{
		List<Planning> p=planServ.GetAllPlanning();
		return p;
	}
	 

}
