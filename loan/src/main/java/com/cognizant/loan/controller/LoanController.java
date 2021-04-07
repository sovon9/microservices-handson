package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {

	@GetMapping("/loans/{number}")
	public Loan getAccount(@PathVariable String number)
	{
		Loan loan=new Loan();
		//loan.setNumber("00987987973432");
		loan.setNumber(number);
		loan.setType("savings");
		loan.setLoan(400000);
		loan.setEmi(3258);
		loan.setTenure(18);
		return loan;
	}
	
}
