package com.qa.business.service;

public interface AccountService {


	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(String account);
	String updateAccount(int accountNumber, String account);
	String findAnAccount(int accountNumber);
	
}
