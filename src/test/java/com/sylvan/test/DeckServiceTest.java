package com.sylvan.test;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DeckServiceTest {
	
	DeckService deckService;
	
	@Autowired
	public DeckServiceTest(DeckService deckService) {
		this.deckService = deckService;
	}

	@Test
	void testSaveAndFindById() {
		Deck newDeck = new Deck();
		newDeck.setDeckName("Naked Nought");
		newDeck.setArchetype("BUG Midrange");
		newDeck.setPlayerName("Nezche");
		newDeck.setFormat("Legacy");
		Deck setDeck = deckService.save(newDeck);
		Deck foundDeck = deckService.findByDeckId(setDeck.getDeckId());
		assertEquals(foundDeck, setDeck);
	}
	
	@Test
	void testFindByPlayerName() {
		Deck newDeck = new Deck();
		newDeck.setDeckName("Sultai Doomsday");
		newDeck.setArchetype("Doomsday");
		newDeck.setPlayerName("Nezche");
		newDeck.setFormat("Legacy");
		Deck setDeck = deckService.save(newDeck);
		List<Deck> foundDecks = deckService.findByPlayerName("Nezche");
		assertTrue(foundDecks.size()>0);
	}
	
	@Test
	void testFindByArchetype() {
		Deck newDeck = new Deck();
		newDeck.setDeckName("Monowhite Bomberman");
		newDeck.setArchetype("Bomberman");
		newDeck.setPlayerName("Nezche");
		newDeck.setFormat("Legacy");
		Deck setDeck = deckService.save(newDeck);
		List<Deck> foundDecks = deckService.findByArchetype("Bomberman");
		assertTrue(foundDecks.size()>0);
	}
}
