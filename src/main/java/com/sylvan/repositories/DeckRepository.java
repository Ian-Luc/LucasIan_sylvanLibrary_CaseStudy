package com.sylvan.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.CardCatalog;
import com.sylvan.entities.DeckCatalog;

//@Repository
public interface DeckRepository extends CrudRepository<DeckCatalog, Integer> {
	
	List<DeckCatalog> findByPlayerName(String player);
	List<DeckCatalog> findByArchetype(String archetype);
	DeckCatalog findByDeckId(Integer id);
//	List<CardCatalog> findCardsByDeckId(Integer deckId);
	DeckCatalog findByDeckNameAndPlayerName(String deckName, String playerName);
//	DeckCatalog removeDeck(DeckCatalog deck);
}
