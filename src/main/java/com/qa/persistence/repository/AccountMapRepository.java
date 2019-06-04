package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.*;
public class AccountMapRepository implements AccountRepository{
	
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	//You must provide concrete implementation for each of these methods
	//do not change the method signature
	//THINK - if the parameter is a String, or the return type is a String
	//How can I convert to a String from an Object?
	//What utility methods do I have available?
	
	//You must complete this section using TDD
	//You can use the suggested tests or build your own.

	public String getAllAccounts() {
		

		return accountMap.toString();
	}

	public String createAccount(String account) {
		
		JSONUtil json = new JSONUtil();
		Account acc = json.getObjectForJSON(account, Account.class);
		accountMap.put(acc.getAccountNumber(), acc );

		return null;
	}

	public String deleteAccount(int accountNumber) {
		
		accountMap.remove(accountNumber);

		return "account number";
	}

	public String updateAccount(int accountNumber, String account) {
		
		JSONUtil json1 = new JSONUtil();
		Account acc1 = json1.getObjectForJSON(account, Account.class);
		accountMap.replace(acc1.getAccountNumber(), acc1);

		return "Account updated";
	}

}
