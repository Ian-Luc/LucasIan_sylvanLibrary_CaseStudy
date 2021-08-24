package org.ianlucas.sylvanlibrary.services;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.Account;

public interface AccountService {
	
//	Boolean validate(String userName, String passWord); 
	Account findByUsername(String username);
	Account save(@Valid Account newUser);
	void removeUser(Account user);
//	UserAccount changePassword(UserAccount user, String password);
//	UserAccount changeUsername(UserAccount user, String username);
//	UserAccount changeProfilePic(UserAccount user, String picUrl);
}
