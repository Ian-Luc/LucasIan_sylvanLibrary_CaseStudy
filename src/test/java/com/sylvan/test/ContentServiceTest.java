package com.sylvan.test;

/*
 * This checks to make sure the find cards function is properly spliting the results
 * The trim() function doesn't work quite as intended here since the paranthesis
 * aren't part of a search on the DB and instead from Mockito. 
 */

import java.util.ArrayList;
import java.util.List;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.repositories.ContentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
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
	
	private static ContentRepository contentRepository;
	
	@BeforeAll
	static void setup(){
		contentRepository = Mockito.mock(ContentRepository.class);
	}
	
	@Test
	void testDbStringReturn() {
		Mockito.when(contentRepository.findCardsIn("Doomsday", "Legacy")).thenReturn(
				new ArrayList<String>(List.of("(Ponder,4)", "(Doomsday,4)","(Force of Will,4)", "(Thassa's Oracle,1)")));
		List<String> result = contentRepository.findCardsIn("Doomsday", "Legacy");
		
		for (String piece : result) {
			String[] data = piece.split(",");
			assertEquals(2, data.length);
			System.out.println(data[0].trim());
			System.out.println(data[1].trim());
		}
		
	}
}
