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

import com.example.demo.models.Role;
import com.example.demo.service.IRoleService;

@RestController
@RequestMapping(value="Role")
public class RoleController {

	@Autowired
	  IRoleService roleServ;
	
	@PostMapping(value = "/addRole")
	public void aadRole(@RequestBody Role r)
	{
		roleServ.addRole(r);
	}
	
	@PutMapping(value="/updateRole")
	public void UpdateRole(@RequestBody Role r){
		roleServ.UpdateRole(r);
	}
	
	@DeleteMapping(value="/deleteRole/{idRole}")
	public void DeleteRole(@PathVariable ("idRole")int idRole) {
		roleServ.DeleteRole(idRole);
		}
	
	@GetMapping(value="/getRole")
	public List<Role> GetAllRole()
	{
		List<Role> r=roleServ.GetAllRole();
		return r;
	}
	}
