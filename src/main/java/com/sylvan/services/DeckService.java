package com.sylvan.services;

import java.util.List;
import com.sylvan.entities.DeckCatalog;

public interface DeckService {
	
	List<DeckCatalog> findByPlayerName(String player);
	List<DeckCatalog> findByArchetype(String archetype);
	DeckCatalog findByDeckId(Integer id);
//	List<CardCatalog> findCardsByDeckId(Integer deckId);
	DeckCatalog findByDeckNameAndPlayerName(String deckName, String playerName);
//	DeckCatalog removeDeck(DeckCatalog deck);
	DeckCatalog save(DeckCatalog deck);
}
