package org.ianlucas.sylvanlibrary.services;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.UserAccount;

public interface AccountService {
	
//	Boolean validate(String userName, String passWord); 
	UserAccount findByUsername(String username);
	UserAccount save(@Valid UserAccount newUser);
	void removeUser(UserAccount user);
//	UserAccount changePassword(UserAccount user, String password);
//	UserAccount changeUsername(UserAccount user, String username);
//	UserAccount changeProfilePic(UserAccount user, String picUrl);
}
