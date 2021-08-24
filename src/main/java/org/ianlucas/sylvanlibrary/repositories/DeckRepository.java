package org.ianlucas.sylvanlibrary.repositories;

import java.util.List;

import org.ianlucas.sylvanlibrary.entities.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {
	
	List<Deck> findByPlayerName(String player);
	List<Deck> findByArchetype(String archetype);
	Deck findByDeckId(Integer id);
	Deck findByDeckNameAndPlayerName(String deckName, String playerName);
	
	List<Deck> findByFormatAndContentCardContaining(String format, String card);
}
