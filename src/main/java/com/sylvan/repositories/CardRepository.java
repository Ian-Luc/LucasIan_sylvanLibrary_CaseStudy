package com.sylvan.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.CardCatalog;
import com.sylvan.entities.DeckCatalog;

@Repository
public interface CardRepository extends CrudRepository<CardCatalog, Integer> {
	
	CardCatalog findByName(String name);
}
