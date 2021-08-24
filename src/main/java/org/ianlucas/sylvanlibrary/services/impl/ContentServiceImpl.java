package org.ianlucas.sylvanlibrary.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.dto.SearchDTO;
import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.ianlucas.sylvanlibrary.repositories.ContentRepository;
import org.ianlucas.sylvanlibrary.repositories.DeckRepository;
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

	@Override
	public List<TotalCardDTO> findTotalQuantityByDeck(String archetype, String format) {
		
		return contentRepository.findTotalQuantityByDeck(archetype, format);
	}

//	@Override
//	public List<ArchetypeDTO> findArchetypeByCardName(String card, String format) {
//		return contentRepository.findArchetypeByCardName(card, format);
//	}

	@Override
	public List<TotalCardDTO> findAllCards(String card, String format) {
		return contentRepository.findAllCards(card, format);
	}

	@Override
	public List<ArchetypeDTO> findAllArchetypes(String archetype, String format) {
		return contentRepository.findAllArchetype(archetype, format);
	}
}
