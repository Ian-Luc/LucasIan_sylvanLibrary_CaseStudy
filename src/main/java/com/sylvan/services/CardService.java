package com.sylvan.services;

import java.util.List;
import com.sylvan.entities.CardCatalog;
import com.sylvan.entities.DeckCatalog;

public interface CardService {
	
	CardCatalog findByName(String name);
	CardCatalog save(CardCatalog card);
}
