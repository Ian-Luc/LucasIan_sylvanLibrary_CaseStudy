package org.ianlucas.sylvanlibrary.repositories;

import java.util.List;

import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {
	
	List<Content> findByDeck(Deck deck);
	
	@Query("SELECT c.card, SUM(c.quantity) "
			+ "FROM Content c JOIN Deck d ON d.deckId = c.deck "
			+ "WHERE d.archetype = ?1 AND d.format = ?2 "
			+ "GROUP BY c.card "
			+ "ORDER BY SUM(c.quantity)")
	List<String> findCardsIn(String archetype, String format);
}
