package org.ianlucas.sylvanlibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

	@GetMapping("/search")
	public String showSearchPage() {
		return "search";
	}
	
	
}
