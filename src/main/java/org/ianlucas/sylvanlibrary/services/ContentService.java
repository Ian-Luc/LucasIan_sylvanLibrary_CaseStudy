package org.ianlucas.sylvanlibrary.services;

import java.util.List;

import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.springframework.stereotype.Service;

@Service
public interface ContentService {
	
	Content save(Content deck);
	List<TotalCardDTO> findTotalQuantityByDeck(String archetype, String format);
//	List<ArchetypeDTO> findArchetypeByCardName(String card, String format); 
	List<TotalCardDTO> findAllCards(String card, String format);
	List<ArchetypeDTO> findAllArchetypes(String archetype, String format);
}
