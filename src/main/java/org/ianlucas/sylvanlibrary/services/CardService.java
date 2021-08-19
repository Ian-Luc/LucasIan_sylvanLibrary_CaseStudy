package org.ianlucas.sylvanlibrary.services;

import org.ianlucas.sylvanlibrary.entities.CardCatalog;

public interface CardService {
	
	CardCatalog findByName(String name);
	CardCatalog save(CardCatalog card);
}
