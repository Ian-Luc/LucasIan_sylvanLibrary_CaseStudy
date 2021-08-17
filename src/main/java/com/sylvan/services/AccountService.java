package com.sylvan.services;

import javax.validation.Valid;

import com.sylvan.entities.UserAccount;

public interface AccountService {
	
//	Boolean validate(String userName, String passWord); 
	UserAccount findByUsername(String username);
	UserAccount save(@Valid UserAccount newUser);
	UserAccount removeUser(String username);
//	UserAccount changePassword(UserAccount user, String password);
//	UserAccount changeUsername(UserAccount user, String username);
//	UserAccount changeProfilePic(UserAccount user, String picUrl);
}
