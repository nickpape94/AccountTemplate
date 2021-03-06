package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(String account);
	String updateAccount(int accountNumber, String account);
	String findAnAccount(int accountNumber);

}
