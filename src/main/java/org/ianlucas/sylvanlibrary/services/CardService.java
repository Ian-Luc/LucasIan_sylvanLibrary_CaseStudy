package org.ianlucas.sylvanlibrary.services;

import org.ianlucas.sylvanlibrary.entities.Cards;

public interface CardService {
	
	Cards findByName(String name);
	Cards save(Cards card);
}
