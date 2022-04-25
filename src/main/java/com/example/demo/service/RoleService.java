package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Role;
import com.example.demo.repositories.IRoleRepository;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleRepository roleRepo;
	
	public void addRole(Role r) {
		// TODO Auto-generated method stub
		roleRepo.save(r);
	}

	@Override
	public void UpdateRole(Role r) {
		// TODO Auto-generated method stub
		roleRepo.save(r);
	}

	@Override
	public void DeleteRole(int idRole) {
		// TODO Auto-generated method stub
		roleRepo.deleteById(idRole);
		
	}

	@Override
	public List<Role> GetAllRole() {
		// TODO Auto-generated method stub
		List<Role> r=roleRepo.findAll();
		return r;
	}

}
