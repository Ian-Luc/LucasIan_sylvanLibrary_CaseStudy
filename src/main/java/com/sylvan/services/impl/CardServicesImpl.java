package com.sylvan.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylvan.entities.CardCatalog;
import com.sylvan.repositories.CardRepository;
import com.sylvan.services.CardService;

@Service
public class CardServicesImpl implements CardService{

	private CardRepository cardRepository;
	
	@Autowired
	public CardServicesImpl(CardRepository cardRepository) {
		this.cardRepository = cardRepository;
	}

	@Override
	public CardCatalog findByName(String name) {
		return cardRepository.findByName(name);
	}

	@Override
	public CardCatalog save(CardCatalog card) {
		return cardRepository.save(card);
	}
}
