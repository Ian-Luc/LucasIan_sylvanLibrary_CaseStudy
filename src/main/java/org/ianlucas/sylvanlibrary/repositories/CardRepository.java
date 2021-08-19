package org.ianlucas.sylvanlibrary.repositories;

import org.ianlucas.sylvanlibrary.entities.CardCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardCatalog, Integer> {
	
	CardCatalog findByName(String name);
}
