package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
public class AcoountController {

	@GetMapping("/accounts/{accnumer}")
	public Account getAccount(@PathVariable String accnumer)
	{
		Account account=new Account();
		//account.setNumber("00987987973432");
		account.setNumber(accnumer);
		account.setType("savings");
		account.setBalance(234343);
		return account;
	}
	
}
