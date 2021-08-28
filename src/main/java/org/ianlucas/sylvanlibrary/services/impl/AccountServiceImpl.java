package org.ianlucas.sylvanlibrary.services.impl;

import org.ianlucas.sylvanlibrary.entities.Account;
import org.ianlucas.sylvanlibrary.repositories.AccountRepository;
import org.ianlucas.sylvanlibrary.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This just adds implementation to the AccountRepository's queries

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Override
	public Account findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}

	@Override
	public Account save(Account newUser) {
		//I wanted to add password encoding, but Spring Security was not playing ball
		return accountRepository.save(newUser);
	}

	@Override
	public void removeUser(Account user) {
		accountRepository.delete(user);
	}
}
