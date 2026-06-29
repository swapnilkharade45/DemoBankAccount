package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankAccount;
import com.example.demo.service.BankAccountService;

@RestController
public class BankAcoountController {

	@Autowired
	private BankAccountService bs;
	
	@GetMapping("display")
	public List<BankAccount> displayBankAccounts() {
		return bs.display();
	}
	
	@PostMapping("add")
	public void addBankAccount(BankAccount b) {
		bs.add(b);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteBankAccount(@PathVariable("id") int accNumber) {
		bs.delete(accNumber);
	}
	
	@PutMapping("update/{existingId}")
	public BankAccount updateBankAccount(@PathVariable("existingId") int accNumber, @RequestBody BankAccount b ) {
		return bs.update(accNumber, b);
	}
	
	@PostMapping("addAll")
	public void addAllBankAccount(@RequestBody List<BankAccount> b) {
		bs.addAll(b);
	}
}

