package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BankAccount;
import com.example.demo.repository.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository br;
	
	@Override
	public void add(BankAccount b) {
		// TODO Auto-generated method stub
		br.save(b);
	}

	@Override
	public List<BankAccount> display() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

}
