package org.ianlucas.sylvanlibrary.services;

import java.util.List;
import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;

public interface DeckService {
	
	Deck findByDeckId(Integer id);
	Deck save(Deck deck);
	List<ArchetypeDTO> findTop10ArchetypeDTO(String card, String format);
	List<Deck> findAll();
}
