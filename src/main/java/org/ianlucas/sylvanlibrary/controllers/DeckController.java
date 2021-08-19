package org.ianlucas.sylvanlibrary.controllers;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.DeckCatalog;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeckController {
	
	private DeckService deckService;
	
	@Autowired
	public DeckController(DeckService deckService) {
		this.deckService = deckService;
	}
	
	@GetMapping("/submit")
	public String showSubmitPage() {
		return "submit";
	}
	
	@GetMapping("/submitDeck")
	public String showSubmitDeckPage(Model model) {
		model.addAttribute("deckCatalog", new DeckCatalog());
		return "submit_deck";
	}
	
	@PostMapping("/registerDeck")
	public String addDeckToDb(@Valid @ModelAttribute("deckCatalog") DeckCatalog deckCatalog,
			BindingResult result) {
		if (result.hasErrors()) {
			return "submit_deck";
		}
		deckService.save(deckCatalog);
		System.out.println(deckCatalog.getDeckName());
		System.out.println(deckService.findByDeckId(deckCatalog.getDeckId()).getDeckName());
		return "redirect:/submit";
	}
}
