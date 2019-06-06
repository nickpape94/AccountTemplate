package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	@Override
	public String createAccount(String account) {
		if(account.contains("Nick")) {
			
			return "Can't Add this account";
		}
		return repo.createAccount(account);
	}

	@Override
	public String deleteAccount(String account) {
		return repo.deleteAccount(account);
	}

	

	

	@Override
	public String findAnAccount(int accountNumber) {
		return repo.findAnAccount(accountNumber);
		
	}

	@Override
	public String updateAccount(int accountNumber, String account) {
		return repo.updateAccount(accountNumber, account);
	}

	

}
