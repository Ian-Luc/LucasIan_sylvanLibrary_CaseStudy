package com.sylvan.services;

import com.sylvan.entities.CardCatalog;

public interface CardService {
	
	CardCatalog findByName(String name);
	CardCatalog save(CardCatalog card);
}
