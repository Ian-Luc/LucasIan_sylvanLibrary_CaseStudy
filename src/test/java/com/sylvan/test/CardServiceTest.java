package com.sylvan.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.entities.Cards;
import org.ianlucas.sylvanlibrary.repositories.CardRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CardServiceTest {
	
	CardRepository cardRepository;
	
	@Autowired
	public CardServiceTest(CardRepository cardRepository) {
		this.cardRepository = cardRepository;
	}
	
	@Test
	void testFindByName() {
		Cards card = new Cards();
		card.setColor("Black");
		card.setCost("B");
		card.setName("Thoughtseize");
		card.setType("Sorcery");
		card.setImgSource(null);
		Cards savedCard = cardRepository.save(card);
		Cards returnCard = cardRepository.findByName("Thoughtseize");
		assertEquals(savedCard, returnCard);
	}
}
