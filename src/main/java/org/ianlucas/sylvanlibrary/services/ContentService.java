package org.ianlucas.sylvanlibrary.services;

import java.util.List;

import org.ianlucas.sylvanlibrary.entities.DeckContent;
import org.springframework.stereotype.Service;

@Service
public interface ContentService {
	
	List<DeckContent> findByDeck(Integer deck);
	List<DeckContent> findByCard(String name);
	DeckContent findByCardAndDeck(String name, Integer deck);
	DeckContent save(DeckContent deck);
}
