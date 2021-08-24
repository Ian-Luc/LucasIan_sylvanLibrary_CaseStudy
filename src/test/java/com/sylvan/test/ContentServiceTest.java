package com.sylvan.test;

import java.util.List;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.ianlucas.sylvanlibrary.services.ContentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContentServiceTest {
	
	ContentService contentService;
	
	@Autowired
	public ContentServiceTest(ContentService contentService) {
		this.contentService = contentService;
	}
	
//	@Test
//	void testContentAddAndFindByCard() {
//		DeckContent deck = new DeckContent();
//		deck.setCard("Phyrexian Dreadnought");
//		deck.setDeck(null);
//		deck.setQuantity(1);
//		DeckContent savedDeck = contentService.save(deck);
//		List<DeckContent> foundDecks = contentService.findByCard("Phyrexian Dreadnought");
//		DeckContent retrievedDeck = foundDecks.get(0);
//		System.out.println(retrievedDeck.getCard());
//		assertEquals(deck.getCard(), retrievedDeck.getCard());
//	}
//	
//	@Test
//	void testFindByDeck() {
//		DeckContent deck = new DeckContent();
//		deck.setCard("Ponder");
//		deck.setDeck(null);
//		deck.setQuantity(4);
//		DeckContent savedDeck = contentService.save(deck);
//		List<DeckContent> foundDecks = contentService.findByDeck(999);
//		assertEquals(savedDeck.getId(), foundDecks.get(0).getId());
//	}
//	
//	@Test
//	void testFindByCardAndDeck() {
//		DeckContent deck = new DeckContent();
//		deck.setCard("Ichorid");
//		deck.setDeck(null);
//		deck.setQuantity(4);
//		DeckContent savedDeck = contentService.save(deck);
//		DeckContent foundDeck = contentService.findByCardAndDeck("Ichorid", 500);
//		assertEquals(savedDeck, foundDeck);
//	}
	
	@Test
	void testFindTop10ByCardName() {
		List<ArchetypeDTO> dtoList = contentService.findTop10ArchetypeDTO("Brainstorm", "Legacy");
		System.out.println(dtoList.size());
		assertEquals(3, dtoList.size());
	}
}
