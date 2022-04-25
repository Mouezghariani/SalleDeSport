package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.models.Role;
import com.example.demo.models.User;

public interface IUserService {
	void addUser(User u);
	
	 void UpdateUser(User u);
	 
	 void DeleteUser(int idUser);
	 
	 List<User> GetAllUser();

	//User getUser(String username);
	
	// Collection<Role> getRoles(String username);
	 
}
