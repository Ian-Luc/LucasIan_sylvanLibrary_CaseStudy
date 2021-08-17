package com.sylvan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.CardCatalog;

@Repository
public interface CardRepository extends JpaRepository<CardCatalog, Integer> {
	
	CardCatalog findByName(String name);
}
