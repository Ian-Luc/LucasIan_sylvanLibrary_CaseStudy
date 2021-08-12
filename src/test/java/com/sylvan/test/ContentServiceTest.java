package com.sylvan.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sylvan.config.WebAppConfig;
import com.sylvan.entities.DeckContent;
import com.sylvan.services.ContentService;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ContentServiceTest {
	
	ContentService contentService;
	
	@Autowired
	public ContentServiceTest(ContentService contentService) {
		this.contentService = contentService;
	}
	
	@Test
	void testContentAddAndFindByCard() {
		DeckContent deck = new DeckContent();
		deck.setCard("Phyrexian Dreadnought");
		deck.setDeck(1);
		deck.setQuantity(1);
		DeckContent savedDeck = contentService.save(deck);
		List<DeckContent> foundDecks = contentService.findByCard("Phyrexian Dreadnought");
		DeckContent retrievedDeck = foundDecks.get(0);
		System.out.println(retrievedDeck.getCard());
		assertEquals(deck.getCard(), retrievedDeck.getCard());
	}
	
	@Test
	void testFindByDeck() {
		DeckContent deck = new DeckContent();
		deck.setCard("Ponder");
		deck.setDeck(999);
		deck.setQuantity(4);
		DeckContent savedDeck = contentService.save(deck);
		List<DeckContent> foundDecks = contentService.findByDeck(999);
		assertEquals(savedDeck.getId(), foundDecks.get(0).getId());
	}
	
	@Test
	void testFindByCardAndDeck() {
		DeckContent deck = new DeckContent();
		deck.setCard("Ichorid");
		deck.setDeck(500);
		deck.setQuantity(4);
		DeckContent savedDeck = contentService.save(deck);
		DeckContent foundDeck = contentService.findByCardAndDeck("Ichorid", 500);
		assertEquals(savedDeck, foundDeck);
	}
}
