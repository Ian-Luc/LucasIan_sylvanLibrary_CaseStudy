package org.ianlucas.sylvanlibrary.services.impl;

import org.ianlucas.sylvanlibrary.entities.CardCatalog;
import org.ianlucas.sylvanlibrary.repositories.CardRepository;
import org.ianlucas.sylvanlibrary.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
