package org.ianlucas.sylvanlibrary.services.impl;

import java.util.List;

import org.ianlucas.sylvanlibrary.entities.DeckContent;
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
	public List<DeckContent> findByDeck(Integer deck) {
		return contentRepository.findByDeck(deck);
	}

	@Override
	public List<DeckContent> findByCard(String name) {
		return contentRepository.findByCardContaining(name);
	}

	@Override
	public DeckContent findByCardAndDeck(String name, Integer deck) {
		return contentRepository.findByCardAndDeck(name, deck);
	}

	@Override
	public DeckContent save(DeckContent deck) {
		return contentRepository.save(deck);
	}
}
