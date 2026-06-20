package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BankAccount;

public interface BankAccountService {

	void add(BankAccount b);
	List<BankAccount> display();
}
