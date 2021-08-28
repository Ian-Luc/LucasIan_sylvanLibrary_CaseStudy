package org.ianlucas.sylvanlibrary.controllers;

/*
 * This controller is devoted to adding card quantities to a deck for Search by 
 * Card and Search by Archetype searches and for adding Card Details to the DB
 */

import org.ianlucas.sylvanlibrary.entities.Cards;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.ianlucas.sylvanlibrary.exceptions.NoDeckFoundException;
import org.ianlucas.sylvanlibrary.services.CardService;
import org.ianlucas.sylvanlibrary.services.ContentService;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContentController {

	private ContentService contentService;
	private DeckService deckService;
	private CardService cardService;
	
	@Autowired
	public ContentController(ContentService contentService, 
			DeckService deckService, CardService cardService) {
		this.contentService = contentService;
		this.deckService = deckService;
		this.cardService = cardService;
	}
	
	@GetMapping("/submitContents")
	public String showSubmitContentsPage(Model model) {
		model.addAttribute("deckContent", new Content());
		return "submit_contents";
	}
	
	@PostMapping("/registerCard")
	public String addDeckToArchive(int deck, 
			String card, 
			int quantity) throws NoDeckFoundException {
		Content deckContent = new Content();
		if (deckService.findByDeckId(deckContent.getId()) == null) {
			throw new NoDeckFoundException("No deck found to add card to!");
		}
		deckContent.setDeck(deckService.findByDeckId(deck));
		deckContent.setCard(card);
		deckContent.setQuantity(quantity);
		contentService.save(deckContent);
		
		return "redirect:/submit_contents";
	}
	
	@GetMapping("/submitCardDetails")
	public String showSubmitCardDetailsPage(Model model) {
		model.addAttribute("cardDetails", new Cards());
		return "submit_cards";
	}
	
	@PostMapping("/registerCardDetails")
	public String addDetails(String name, String type, String color, String cost) {
		Cards cardDetails = new Cards();
		cardDetails.setName(name);
		cardDetails.setType(type);
		cardDetails.setColor(color);
		cardDetails.setCost(cost);
		cardDetails.setImgSource(null);
		cardService.save(cardDetails);
		return "redirect:/submit_cards";
	}
}
