package org.ianlucas.sylvanlibrary.repositories;

import org.ianlucas.sylvanlibrary.entities.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Cards, Integer> {
	
	Cards findByName(String name);
}
