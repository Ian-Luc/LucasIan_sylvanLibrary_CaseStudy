package com.sylvan.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylvan.entities.CardCatalog;
import com.sylvan.entities.DeckCatalog;
import com.sylvan.repositories.DeckRepository;
import com.sylvan.services.DeckService;

@Service("DeckService")
public class DeckServiceImpl implements DeckService{
	
	private DeckRepository deckRepository;
	
	@Autowired
	public DeckServiceImpl(DeckRepository deckRepository) {
		this.deckRepository = deckRepository;
	}

	@Override
	public List<DeckCatalog> findByPlayerName(String player) {
		return deckRepository.findByPlayerName(player);
	}

	@Override
	public List<DeckCatalog> findByArchetype(String archetype) {
		return deckRepository.findByArchetype(archetype);
	}

	@Override
	public DeckCatalog findByDeckId(Integer id) {
		return deckRepository.findByDeckId(id);
	}

	@Override
	public DeckCatalog findByDeckNameAndPlayerName(String deckName, String playerName) {
		return deckRepository.findByDeckNameAndPlayerName(deckName, playerName);
	}

//	@Override
//	public DeckCatalog removeDeck(DeckCatalog deck) {
//		return deckRepository.removeDeck(deck);
//	}
//
//	@Override
//	public List<CardCatalog> findCardsByDeckId(Integer deckId) {
//		return deckRepository.findCardsByDeckId(deckId);
//	}
	
	@Override
	public DeckCatalog save(DeckCatalog deck) {
		return deckRepository.save(deck);
	}
}
