package org.ianlucas.sylvanlibrary.controllers;

import javax.validation.Valid;

import org.ianlucas.sylvanlibrary.entities.UserAccount;
import org.ianlucas.sylvanlibrary.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
	
	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@PostMapping("/registerNewUser")
	public String showRegisterNewUser(@Valid @ModelAttribute("newUser") UserAccount newUser, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		UserAccount user = accountService.save(newUser);
		System.out.println(user.getUsername());
		return "redirect:/account";
	}
	
	@PostMapping("/changeUsername")
	public String attemptChangeUsername(@Valid @ModelAttribute("currentUser") UserAccount currentUser, String newName,
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		UserAccount user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newName);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/changePassword")
	public String attemptChangePassword(@Valid @ModelAttribute("currentUser") UserAccount currentUser, String newPass,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/account";
		}
		UserAccount user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newPass);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/changePicture")
	public String attemptChangePicture(@Valid @ModelAttribute("currentUser") UserAccount currentUser, String newPic,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/account";
		}
		UserAccount user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newPic);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/removeAccount")
	public String deleteAccount(@Valid @ModelAttribute("currentUser") UserAccount currentUser,
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		accountService.removeUser(currentUser);
		return "redirect:/account";
	}
}
