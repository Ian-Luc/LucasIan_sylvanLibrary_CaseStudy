package com.sylvan.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.ianlucas.sylvanlibrary.config.WebAppConfig;
import org.ianlucas.sylvanlibrary.entities.Account;
import org.ianlucas.sylvanlibrary.repositories.AccountRepository;
import org.ianlucas.sylvanlibrary.services.AccountService;
import org.ianlucas.sylvanlibrary.services.impl.AccountServiceImpl;

/*
 * A simple test class for the findByUsername class
 * This is of vital importance, as it is required to login and access Account
 * functionality
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountServiceTest {

	private static AccountRepository accountRepository;
	private static AccountService accountService;
	
	@BeforeAll
	static void setup() {
		accountRepository = Mockito.mock(AccountRepository.class);
		accountService = new AccountServiceImpl(accountRepository);
	}
	
	@Test
	void testFindByUsername() {
		Mockito.when(accountService.findByUsername("nezmog")).thenReturn(
				new Account("nezmog", "TwitchIsGood"));		
		Account newUser = new Account();
		newUser.setUsername("nezmog");
		newUser.setPassword("TwitchIsGood");
		Account foundUser = accountService.findByUsername("nezmog");
		System.out.println(foundUser.getUsername());
		assertTrue(newUser.getUsername().equals(foundUser.getUsername()));
		assertTrue(newUser.getPassword().equals(foundUser.getPassword()));
	}
}
