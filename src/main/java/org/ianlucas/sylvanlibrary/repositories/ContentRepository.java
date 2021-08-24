package org.ianlucas.sylvanlibrary.repositories;

import java.util.List;

import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {
	
	@Query("SELECT c.card, SUM(c.quantity) "
			+ "FROM Content c JOIN Deck d "
			+ "WHERE d.archetype = ?1 AND d.format = ?2 "
			+ "GROUP BY c.card "
			+ "ORDER BY SUM(c.quantity)")
	List<TotalCardDTO> findTotalQuantityByDeck(String archetype, String format);
	
	@Query("SELECT d "
			+ "FROM Content c JOIN Deck d "
			+ "GROUP BY d.archetype "
			+ "ORDER BY SUM(c.quantity) ASC")
	List<ArchetypeDTO> findAllArchetype(String card, String format);
	
	@Query("SELECT c.card, SUM(c.quantity) "
			+ "FROM Content c JOIN Deck d "
			+ "GROUP BY c.card "
			+ "ORDER BY SUM(c.quantity)")
	List<TotalCardDTO> findAllCards(String archetype, String format);
}
