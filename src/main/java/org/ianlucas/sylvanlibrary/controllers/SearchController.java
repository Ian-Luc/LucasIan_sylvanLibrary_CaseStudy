package org.ianlucas.sylvanlibrary.controllers;

import java.sql.ResultSet;
import java.util.List;
import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.dto.SearchDTO;
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
	private String searchPage;
	
	@Autowired
	public SearchController(ContentService contentService, DeckService deckService) {
		this.contentService = contentService;
		this.deckService = deckService;
		searchPage = "search";
	}

	@GetMapping("/search")
	public String showSearchPage(Model model) {
		model.addAttribute("searchDto", new SearchDTO());
		return searchPage;
	}
	
//	@GetMapping("/searchByArchetype")
//	@ResponseBody 
//	public List<TotalCardDTO> findCardsToDisplay(Map<String, Object> model) {
//	    List<TotalCardDTO> dtoList = contentService.findTotalQuantityByDeck(model);
//	    return dtoList;
//	  }
	
	//I originally wanted to use a DTO to transfer the data, but the form and the 
	@PostMapping("/searchByCard")
//	public String findArchetypesToDisplay(@RequestBody SearchDTO searchDto,
	public String findArchetypesToDisplay(String item, String format,
			Model model,
			ResultSet result) {
//		if (result.hasErrors()) {
//			System.out.println("There was a bit of error!~");
//			return searchPage;
//		}
//		List<ArchetypeDTO> dtoList = contentService.findArchetypeByCardName(searchDto.getItem(), searchDto.getFormat());
		List<ArchetypeDTO> dtoList = deckService.findTop10ArchetypeDTO(item, format);
		System.out.println(dtoList.size());
//		if (!dtoList.isEmpty()) {
//			for (int i = 0; i < dtoList.size(); i++) {
//				ArchetypeDTO archeDto = dtoList.get(i);
//				model.addAttribute("dto_"+i, archeDto);
//				if (i == 9) break;
//			}
//		} else {
//			dtoList = contentService.findAllArchetypes(item, format);
//			if (!dtoList.isEmpty()) {
//				for (int i = 0; i < dtoList.size(); i++) {
//					ArchetypeDTO archeDto = dtoList.get(i);
//					model.addAttribute("dto_"+i, archeDto);
//					if (i == 9) break;
//				}
//			}
//		}
		return searchPage;
	}
}
