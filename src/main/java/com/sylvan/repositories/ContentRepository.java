package com.sylvan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.DeckContent;

@Repository
public interface ContentRepository extends JpaRepository<DeckContent, Integer> {
	
	List<DeckContent> findByDeck(Integer deck);
	List<DeckContent> findByCardContaining(String name);
	DeckContent findByCardAndDeck(String name, Integer deck);
}
