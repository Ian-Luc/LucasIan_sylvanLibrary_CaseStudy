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
	
	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@GetMapping("/account")
	public String showAccountPage(Model model) {
		model.addAttribute("UserAccount", new Account());
		return "account";
	}
	
	@PostMapping("/registerNewUser")
	public String showRegisterNewUser(@Valid @ModelAttribute("newUser") Account newUser, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		Account user = accountService.save(newUser);
		System.out.println(user.getUsername());
		return "redirect:/account";
	}
	
	@PostMapping("/changeUsername")
	public String attemptChangeUsername(@Valid @ModelAttribute("currentUser") Account currentUser, String newName,
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		Account user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newName);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/changePassword")
	public String attemptChangePassword(@Valid @ModelAttribute("currentUser") Account currentUser, String newPass,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/account";
		}
		Account user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newPass);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/changePicture")
	public String attemptChangePicture(@Valid @ModelAttribute("currentUser") Account currentUser, String newPic,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/account";
		}
		Account user = accountService.findByUsername(currentUser.getUsername());
		accountService.removeUser(currentUser);
		user.setUsername(newPic);
		accountService.save(user);
		return "redirect:/account";
	}
	
	@PostMapping("/removeAccount")
	public String deleteAccount(@Valid @ModelAttribute("currentUser") Account currentUser,
			BindingResult result) {
		if (result.hasErrors()) {
			return "account";
		}
		accountService.removeUser(currentUser);
		return "redirect:/account";
	}
}
