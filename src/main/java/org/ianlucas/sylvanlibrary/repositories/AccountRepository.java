package org.ianlucas.sylvanlibrary.repositories;

import org.ianlucas.sylvanlibrary.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<UserAccount, String> {
	
	UserAccount findByUsername(String username);
}
