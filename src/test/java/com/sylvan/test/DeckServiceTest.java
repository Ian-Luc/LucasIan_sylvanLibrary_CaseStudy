package com.sylvan.test;

/*
 * This test is supposed to be for Search By Card function, but I can't seem to
 * get a list to work inside of Mockito and it is really frustrating 
 */

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.repositories.DeckRepository;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.ianlucas.sylvanlibrary.services.impl.DeckServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DeckServiceTest {
	
	private static DeckService deckService;
	private static DeckRepository deckRepository;
	
	@BeforeAll
	static void setup() {
		deckRepository = Mockito.mock(DeckRepository.class);
		deckService = new DeckServiceImpl(deckRepository);
	}

	@Test
	void testFindArchetypesQuery() {
		Mockito.when(deckRepository.findListByThings("Brainstorm", "Legacy")).thenReturn(
				new ArrayList<Deck>(List.of(new Deck("Naked Noughts", "Legacy", "Nez", null))));
		List<ArchetypeDTO> deckList = deckService.findTop10ArchetypeDTO("Brainstorm", "Legacy");
		assertEquals("Naked Noughts", deckList.get(0).getName());
		assertEquals("Legacy", deckList.get(0).getFormat());
		assertEquals("Nez", deckList.get(0).getPlayerName());
	}
}
