package org.ianlucas.sylvanlibrary.services;

import org.ianlucas.sylvanlibrary.entities.Account;

public interface AccountService {
	Account findByUsername(String username);
	Account save(Account newUser);
	void removeUser(Account user);
}
