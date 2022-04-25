package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Coach;
@Repository
public interface ICoachRepository extends JpaRepository<Coach, Integer> {

}

