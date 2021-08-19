package org.ianlucas.sylvanlibrary.services.impl;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.UserAccount;
import org.ianlucas.sylvanlibrary.repositories.AccountRepository;
import org.ianlucas.sylvanlibrary.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

	@Override
	public UserAccount save(@Valid UserAccount newUser) {
		return accountRepository.save(newUser);
	}

	@Override
	public void removeUser(UserAccount user) {
//		UserAccount user = accountRepository.findByUsername(username);
//		if (user == null) {
//			return null;
//		}
		accountRepository.delete(user);
//		return user;
	}
}
