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


import com.example.demo.models.User;
import com.example.demo.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping(value = "User")
public class UserController {

	@Autowired
	IUserService userServ;

	@PostMapping(value = "/addUser")
	public void addUser(@RequestBody User u) {
		userServ.addUser(u);

	}

	@PutMapping(value = "/UpdateUser")
	public void UpdateUser(@RequestBody User u) {
		userServ.UpdateUser(u);

	}

	@DeleteMapping(value = "/DeleteUser/{idUser}")
	public void deleteUser(@PathVariable("idUser") int idUser) {
		userServ.DeleteUser(idUser);
	}
	
	@GetMapping(value = "/GetAllUsers")
	public List<User> GetAllUsers() {
		List<User> u = userServ.GetAllUser();
		return u;
	}
	
}
