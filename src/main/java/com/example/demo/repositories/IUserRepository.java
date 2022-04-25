package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

	
	@Query("SELECT u FROM User u WHERE u.username = :username and u.mdp = :mdp")
	
	 User findByusernameAndmdp(String username,String mdp);
	
	
	
	
   //   public User findByUsername (@Param ("username") String username);
	  
 
}
