package org.ianlucas.sylvanlibrary.services;

import java.util.List;

import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;

public interface DeckService {
	
	List<Deck> findByPlayerName(String player);
	List<Deck> findByArchetype(String archetype);
	Deck findByDeckId(Integer id);
//	List<CardCatalog> findCardsByDeckId(Integer deckId);
	Deck findByDeckNameAndPlayerName(String deckName, String playerName);
//	DeckCatalog removeDeck(DeckCatalog deck);
	Deck save(Deck deck);
	List<ArchetypeDTO> findTop10ArchetypeDTO(String card, String format);
}
