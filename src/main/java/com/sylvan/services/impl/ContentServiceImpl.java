package com.sylvan.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylvan.entities.DeckContent;
import com.sylvan.repositories.ContentRepository;
import com.sylvan.services.ContentService;

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
