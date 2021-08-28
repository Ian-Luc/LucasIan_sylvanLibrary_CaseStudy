package org.ianlucas.sylvanlibrary.repositories;

import java.util.List;

import org.ianlucas.sylvanlibrary.entities.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {
	
	Deck findByDeckId(int id);
	
	@Query("SELECT d "
			+ "FROM Deck d JOIN Content c ON d.deckId = c.deck "
			+ "WHERE d.format = ?1 AND c.card = ?2 AND d.deckId = c.deck")
	List<Deck> findListByThings(String format, String card);
	
}
