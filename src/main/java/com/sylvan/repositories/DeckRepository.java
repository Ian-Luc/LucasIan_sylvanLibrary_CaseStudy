package com.sylvan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.DeckCatalog;

@Repository
public interface DeckRepository extends JpaRepository<DeckCatalog, Integer> {
	
	List<DeckCatalog> findByPlayerName(String player);
	List<DeckCatalog> findByArchetype(String archetype);
	DeckCatalog findByDeckId(Integer id);
//	List<CardCatalog> findCardsByDeckId(Integer deckId);
	DeckCatalog findByDeckNameAndPlayerName(String deckName, String playerName);
//	DeckCatalog removeDeck(DeckCatalog deck);
}
