package com.sylvan.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sylvan.entities.UserAccount;
import com.sylvan.repositories.AccountRepository;
import com.sylvan.services.AccountService;

public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

//	@Override
//	public Boolean validate(String userName, String passWord) {
//		UserAccount user = accountRepository.findByUsername(userName);
//		if (user == null) {
//			return false;
//		}
//		String userPassword = user.getPassword(); 
//		if (userPassword.equals(passWord)) {
//			return true;
//		}
//		return false;
//	}
	
	@Override
	public UserAccount findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}
}
