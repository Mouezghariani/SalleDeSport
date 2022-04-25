/*package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repositories.IUserRepository;
@Service
@Component
public class MyUserServiceDetails implements UserDetailsService {

	@Autowired
	private IUserRepository userrepo;
	@Override
	public UserDetails loadUserByUsername( String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User u =userrepo.findByUsername(username);
		if(u==null)
			throw new UsernameNotFoundException("invalid Username");
			
		return new org.springframework.security.core.userdetails.User(u.getUsername(), u.getMdp(), mapToGranteAuthrities(u.getRole()));
		
		
		
	}

	private static List<GrantedAuthority> mapToGranteAuthrities(Set<Role> set)
	{
		List<GrantedAuthority> GrantedAyrhoritiesList = new ArrayList<>();
		return GrantedAyrhoritiesList;
	}
	}


*/