package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repositories.IUserRepository;

@Service
public class LoginService implements ILoginService {

    private final IUserRepository userRepo;


    public LoginService (IUserRepository userRepo) {
      this.userRepo=userRepo;

    }

    @Override
    public String login(String username, String mdp) {
       
        if (userRepo.findByusernameAndmdp(username, mdp)!=null)
        	
        {	return "vlide";}
        else  return " non valide";

        
    }
}