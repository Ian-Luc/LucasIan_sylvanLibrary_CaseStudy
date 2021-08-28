package org.ianlucas.sylvanlibrary.controllers;

/*
 * The for loops add the results of the search to the model to be displayed on
 * the search result page. I wanted to limit the amount of results for this 
 * since it seems that in order to have a dynamic amount of reults would require
 * the use of PHP and that is outside of the scope of the curriculum of the class
 */

import java.util.List;
import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.dto.SearchDTO;
import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Cards;
import org.ianlucas.sylvanlibrary.services.CardService;
import org.ianlucas.sylvanlibrary.services.ContentService;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {
	
	private ContentService contentService;
	private DeckService deckService;
	private CardService cardService;
	
	@Autowired
	public SearchController(ContentService contentService, DeckService deckService, CardService cardService) {
		this.contentService = contentService;
		this.deckService = deckService;
		this.cardService = cardService;
	}

	@GetMapping("/search")
	public String showSearchPage(Model model) {
		model.addAttribute("searchDto", new SearchDTO());
		return "search";
	}
	
	@PostMapping("/searchByDeck")
	public String findCardsToDisplay(String item, String format,
			Model model) {
	    List<TotalCardDTO> dtoList = contentService.findLowCards(item, format);
	    if (!dtoList.isEmpty()) {
	    	for (int i = 0; i < dtoList.size(); i++) {
	    		model.addAttribute("dto_"+i, dtoList.get(i));
	    		Cards card = cardService.findByName(dtoList.get(i).getCard());
	    		if (card != null) model.addAttribute("card_"+i, card);
	    		if (i >= 4) break;
	    	}
	    }
	    System.out.println("DTO List: "+dtoList.size());
	    return "deck_results";
	  }
	
	@PostMapping("/searchByCard")
	public String findArchetypesToDisplay(String item, String format,
			Model model) {
		System.out.println("IN SEARCH CONTROLLER...");
		List<ArchetypeDTO> dtoList = deckService.findTop10ArchetypeDTO(item, format);
		System.out.println("Class is " + dtoList.getClass().descriptorString());
		System.out.println("DTO List size: " + dtoList.size());
		if (!dtoList.isEmpty()) {
			for (int i = 0; i < dtoList.size(); i++) {
				System.out.println("In the for loop "+i+" time...");
				ArchetypeDTO archeDto = dtoList.get(i);
				model.addAttribute("dto_"+i, archeDto);
				if (i >= 4) break;
			}
		}
		return "card_results";
	}
}
