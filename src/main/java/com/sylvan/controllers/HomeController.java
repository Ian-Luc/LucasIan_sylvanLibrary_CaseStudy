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
		value = "/Search",
		method = {RequestMethod.GET, RequestMethod.POST})
	public String showSearchPage() {
		return "Search";
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
	
	@GetMapping("/newaccount")
	public String showNewAccount() {
		return "newaccount";
	}
}