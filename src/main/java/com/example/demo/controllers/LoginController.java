package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Login;
import com.example.demo.service.ILoginService;

@CrossOrigin()
@RestController
@RequestMapping("api/login")
public class LoginController {
	
	


	    private final ILoginService iLoginService;

	    public LoginController(ILoginService iLoginService) {
	        this.iLoginService = iLoginService;
	    }

	    @PostMapping()
	    public String login(@RequestBody Login login) {
	        return iLoginService.login(login.getUsername(), login.getMdp());
	    }

	}

