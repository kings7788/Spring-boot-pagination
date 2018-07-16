package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{
	
	
}
