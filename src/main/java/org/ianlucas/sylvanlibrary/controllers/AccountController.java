package org.ianlucas.sylvanlibrary.controllers;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.Account;
import org.ianlucas.sylvanlibrary.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
	
	/*
	 * This controller is for the login, logout, and account pages of the website
	 * Has the methods for making, changing, and deleting users
	 * It does use a static field for the current user and I know that is bad practice
	 */
	
	private AccountService accountService;
	//I wanted to have keep an Account that the user would modify, but I am not sure how to do it outside of a static field
	public static Account currentSession;
	private String redirectToAccount;
	
	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
		redirectToAccount = "redirect:/account";
	}
	
	@GetMapping("/account")
	public String showAccountPage(Model model) {
		model.addAttribute("currentAccount", currentSession);
		return "account";
	}
	
	@PostMapping("/changeUsername")
	public String attemptChangeUsername(String newName) {
		Account user = accountService.findByUsername(currentSession.getUsername());
		accountService.removeUser(currentSession);
		user.setUsername(newName);
		accountService.save(user);
		return redirectToAccount;
	}
	
	@PostMapping("/changePassword")
	public String attemptChangePassword(String newPass) {
		Account user = accountService.findByUsername(currentSession.getUsername());
		accountService.removeUser(user);
		user.setUsername(newPass);
		accountService.save(user);
		return redirectToAccount;
	}
	
	@PostMapping("/removeAccount")
	public String deleteAccount() {
		accountService.removeUser(currentSession);
		return "logout";
	}
	
	@GetMapping("/newAccount")
	public String showNewAccountPage(Model model) {
		model.addAttribute("Account", new Account());
		return "new_account";
	}
	
	@PostMapping("/createAccount")
	public String makeAccount(@Valid @ModelAttribute("Account") Account newUser, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "new_account";
		}
		if (accountService.findByUsername(newUser.getUsername()) == null) {
			accountService.save(newUser);
			return "login";
		}
		return "redirect:/new_account";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/loginToUser")
	public String loggingIn(String username, String password) {
		Account storedUser = accountService.findByUsername(username);
		System.out.println(username);
		if (storedUser != null && password.equals(storedUser.getPassword())) {
				currentSession = storedUser;
				return "main";	
		}
		return "redirect:/login";
	}
	
	@GetMapping("/logout")
	public static String logOut() {
		currentSession = null;
		return "logout";
	}
}
