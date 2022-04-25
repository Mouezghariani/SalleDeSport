package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Abonnement;

@Repository
public interface IAbonnementRepository extends JpaRepository<Abonnement,Integer>{

}
