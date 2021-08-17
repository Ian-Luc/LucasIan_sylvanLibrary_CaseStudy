package com.sylvan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylvan.entities.UserAccount;

@Repository
public interface AccountRepository extends JpaRepository<UserAccount, String> {
	
	UserAccount findByUsername(String username);
	UserAccount removeUser(String username);
}
