package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Role;

public interface IRoleService {
	void addRole(Role r);
	
	void UpdateRole(Role r);
	
	void DeleteRole(int idRole);
	
	List<Role> GetAllRole();

}
