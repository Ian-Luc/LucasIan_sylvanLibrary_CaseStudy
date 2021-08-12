package com.sylvan.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.UserAccount;

@Repository
public interface AccountRepository extends CrudRepository<UserAccount, String> {
	
	UserAccount findByUsername(String username);
}
