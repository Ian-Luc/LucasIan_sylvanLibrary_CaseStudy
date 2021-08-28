package org.ianlucas.sylvanlibrary.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.ianlucas.sylvanlibrary.repositories.ContentRepository;
import org.ianlucas.sylvanlibrary.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
	
	private ContentRepository contentRepository;
	
	@Autowired
	public ContentServiceImpl(ContentRepository contentRepository) {
		this.contentRepository = contentRepository;
		
	}
	
	@Override
	public Content save(Content deck) {
		return contentRepository.save(deck);
	}
	
	//Core method for the Search by Archetype function: returns the TotalCardDTOs to be read by the Search Controller
	@Override
	public List<TotalCardDTO> findLowCards(String archetype, String format) {
		List<TotalCardDTO> dtoList = new ArrayList<>();
		System.out.println(contentRepository.findCardsIn(archetype, format).size());
		for (String card : contentRepository.findCardsIn(archetype, format)) {
			TotalCardDTO addDto = new TotalCardDTO();
			String[] data = card.split(",");
			addDto.setCard(data[0].trim());
			addDto.setQuantity(Integer.parseInt(data[1].trim()));
			System.out.println(data[0].trim());
			System.out.println(data[1].trim());
			dtoList.add(addDto);
		}
		return dtoList;
	}
}
