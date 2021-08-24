package org.ianlucas.sylvanlibrary.controllers;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.Content;
import org.ianlucas.sylvanlibrary.exceptions.NoDeckFoundException;
import org.ianlucas.sylvanlibrary.services.ContentService;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContentController {

	private ContentService contentService;
	private DeckService deckService;
	
	@Autowired
	public ContentController(ContentService contentService, 
			DeckService deckService) {
		this.contentService = contentService;
		this.deckService = deckService;
	}
	
	@GetMapping("/submitContents")
	public String showSubmitContentsPage(Model model) {
		model.addAttribute("deckContent", new Content());
		return "submit_contents";
	}
	
	@PostMapping("/registerCard")
	public String addDeckToArchive(int deck, 
			String card, 
			int quantity) {
		Content deckContent = new Content();
//		if (deckService.findByDeckId(deckContent.getId()) == null) {
//			throw new NoDeckFoundException("No deck found to add card to!");
//		}
		deckContent.setDeck(deckService.findByDeckId(deck));
		deckContent.setCard(card);
		deckContent.setQuantity(quantity);
		contentService.save(deckContent);
		
		return "redirect:/submit";
	}
}
