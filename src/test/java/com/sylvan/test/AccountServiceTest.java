package com.sylvan.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.entities.Account;
import org.ianlucas.sylvanlibrary.repositories.AccountRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AccountServiceTest {

	AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceTest(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Test
	void testFindByUsername() {
		Account newUser = new Account();
		newUser.setUsername("nezmog");
		newUser.setPassword("TwitchIsGood");
		Account savedUser = accountRepository.save(newUser);
		Account foundUser = accountRepository.findByUsername("nezmog");
		assertTrue(savedUser.equals(foundUser));
	}
	
	@Test
	void testValidate() {
		
	}
}
