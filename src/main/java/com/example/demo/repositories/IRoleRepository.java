package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer>{

}
