package com.sylvan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sylvan.services.DeckService;
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
	
	//I cannot for the life of me get this page to work
	@RequestMapping(
		value = "/search",
		method = {RequestMethod.GET, RequestMethod.POST})
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
	public String showAccountPage() {
		return "account";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/newAccount")
	public String showNewAccountPage() {
		return "newAccount";
	}
	
	@GetMapping("/submit")
	public String showSubmitPage() {
		return "submit";
	}
}