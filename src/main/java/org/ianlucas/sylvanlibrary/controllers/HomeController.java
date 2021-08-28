package org.ianlucas.sylvanlibrary.controllers;

/*
 * This is for all the basic pages that don't have advanced functionality 
 * Other controllers handle database connections and account management
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "main";
	}
	
	@GetMapping("/main")
	public String showMainPage() {
		return "main";
	}
	
	@GetMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	
	@GetMapping("/rat")
	public String showRatPage() {
		return "rat";
	}
}