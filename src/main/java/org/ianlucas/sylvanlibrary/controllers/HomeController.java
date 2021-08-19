package org.ianlucas.sylvanlibrary.controllers;

import org.ianlucas.sylvanlibrary.entities.DeckCatalog;
import org.ianlucas.sylvanlibrary.entities.DeckContent;
import org.ianlucas.sylvanlibrary.entities.UserAccount;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//@RequestParam("deck_id") UUID deckId, 
//			Model model
@Controller
public class HomeController {
	
	private DeckService deckService;
	
	@Autowired
	public HomeController(DeckService deckService) {
		this.deckService = deckService;
	}
	
	@GetMapping("/")
	public String showHomePage() {
		return "main";
	}
	
	@GetMapping("/main")
	public String showMainPage() {
		return "main";
	}
	
	@GetMapping("/search")
	public String showSearchPage() {
		return "search";
	}
	
	@GetMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	
	@GetMapping("/rat")
	public String showRatPage() {
		return "rat";
	}
	
	@GetMapping("/account")
	public String showAccountPage(Model model) {
		model.addAttribute("UserAccount", new UserAccount());
		return "account";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/newAccount")
	public String showNewAccountPage() {
		return "new_account";
	}
}