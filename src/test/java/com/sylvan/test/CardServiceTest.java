package com.sylvan.test;

/*
 * This just makes sure that the cards are being to be called properly from the 
 * database
 * Pretty simple
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.entities.Cards;
import org.ianlucas.sylvanlibrary.repositories.CardRepository;
import org.ianlucas.sylvanlibrary.services.CardService;
import org.ianlucas.sylvanlibrary.services.impl.CardServicesImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CardServiceTest {
	
	private static CardRepository cardRepository;
	private static CardService cardService;
	
	@BeforeAll
	static void setup() {
		cardRepository = Mockito.mock(CardRepository.class);
		cardService = new CardServicesImpl(cardRepository);
	}
	
	@Test
	void testFindByName() {
		Mockito.when(cardRepository.findByName("Thoughtseize")).thenReturn(
				new Cards("Thoughtseize", "Sorcery", "Black", "B"));
		Cards card = new Cards();
		card.setColor("Black");
		card.setCost("B");
		card.setName("Thoughtseize");
		card.setType("Sorcery");
		card.setImgSource(null);
		Cards returnCard = cardService.findByName("Thoughtseize");
		assertEquals("Thoughtseize", returnCard.getName());
		assertEquals("Sorcery", returnCard.getType());
		assertEquals("Black", returnCard.getColor());
		assertEquals("B", returnCard.getCost());
	}
}
