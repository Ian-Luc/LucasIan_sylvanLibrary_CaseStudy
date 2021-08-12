package com.sylvan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sylvan.entities.DeckContent;

@Service
public interface ContentService {
	
	List<DeckContent> findByDeck(Integer deck);
	List<DeckContent> findByCard(String name);
	DeckContent findByCardAndDeck(String name, Integer deck);
	DeckContent save(DeckContent deck);
}
