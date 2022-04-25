package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repositories.IUserRepository;




@Service
public class UserService implements IUserService{
	@Autowired
	IUserRepository userRepo;
	
   
    

    @Override
 /*   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Logger log = LoggerFactory.getLogger(UserService.class);
        User user = userRepo.findByUsername (username);
        if(user == null) {
            log.error("User not found in the database");
            throw new UsernameNotFoundException("User not found in the database");
        } else {
            log.info("User found in the database: {}", username);
        }
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            user.getRole().forEach(role -> {
                authorities.add(new SimpleGrantedAuthority(role.getRole()));
            });

            return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getMdp(),authorities) ;
        }*/
	
	public void addUser(User u) { // ajout 
		userRepo.save(u);
	}
	
	public void UpdateUser(User u) {   // update 
		userRepo.save(u);
	}
	public void DeleteUser(int idUser) {
		userRepo.deleteById(idUser);/// delete 
		
	}
	
	public List<User> GetAllUser() { // selecet *
		List<User> u = userRepo.findAll();
		return u;
		
	}
	 /*
	   public User getUser(String username) {
		 Logger log = LoggerFactory.getLogger(UserService.class);
		 log.info("fetching user {} ",username);

	        return userRepo.findByUsername(username);
	    }
	    */
	 /*   public Collection<Role> getRoles(String username) {

            User user = userRepo.findByUsername(username);
            return user.getRole() ;
	    }
    */

}
