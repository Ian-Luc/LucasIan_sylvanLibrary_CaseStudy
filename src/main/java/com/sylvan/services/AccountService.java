package com.sylvan.services;

import com.sylvan.entities.UserAccount;

public interface AccountService {
	
//	Boolean validate(String userName, String passWord); 
	UserAccount findByUsername(String username);
}
