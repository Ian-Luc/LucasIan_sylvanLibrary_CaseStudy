package org.ianlucas.sylvanlibrary.services.impl;

import org.ianlucas.sylvanlibrary.entities.Cards;
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
	public Cards findByName(String name) {
		return cardRepository.findByName(name);
	}

	@Override
	public Cards save(Cards card) {
		return cardRepository.save(card);
	}
}
