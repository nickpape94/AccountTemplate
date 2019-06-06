package com.qa.MapTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;
import com.qa.util.JSONUtil;

public class AccountServiceTest {

	private JSONUtil jsonUtil;
	private AccountMapRepository amp;

	@Before
	public void setup() {
		jsonUtil = new JSONUtil();
		amp = new AccountMapRepository();

	}

	@Test
	public void addAccountTest() {

		Account acc = new Account(1, 1234, "John", "Smith");
		String accString = jsonUtil.getJSONForObject(acc);

		assertEquals("Account not created", "Account added", amp.createAccount(accString));

	}

	@Test
	public void add2AccountsTest() {
		Account acc1 = new Account(2, 1234, "John", "Smith");
		Account acc2 = new Account(3, 12345, "Jane", "Doe");

		String acc1String = jsonUtil.getJSONForObject(acc1);
		String acc2String = jsonUtil.getJSONForObject(acc2);

		assertEquals("Account not created", "Account added", amp.createAccount(acc1String));
		assertEquals("Account not created", "Account added", amp.createAccount(acc2String));
	}

	@Test
	public void removeAccountTest() {
		Account acc = new Account(5, 1234, "John", "Smith");
		String accString = jsonUtil.getJSONForObject(acc);
		amp.createAccount(accString);

		int accountNumber = acc.getAccountNumber();

		assertEquals("Account not removed", "Account deleted", amp.deleteAccount(accountNumber));
	}

	@Test
	public void remove2AccountsTest() {
		Account acc1 = new Account(6, 1234, "John", "Smith");
		Account acc2 = new Account(7, 1230, "Jane", "Doe");

		String acc1String = jsonUtil.getJSONForObject(acc1);
		String acc2String = jsonUtil.getJSONForObject(acc2);

		amp.createAccount(acc1String);
		amp.createAccount(acc2String);

		int accNo1 = acc1.getAccountNumber();
		int accNo2 = acc2.getAccountNumber();

		assertEquals("Account not removed", "Account deleted", amp.deleteAccount(accNo1));
		assertEquals("Account not removed", "Account deleted", amp.deleteAccount(accNo2));

	}
	
	@Test
	public void accountsByFirstName (String firstName) {
		
		//create an account
		Account acc1 = new Account(8, 123, "John", "Smith");
		Account acc2 = new Account(9, 456, "Joe", "Smo");
		Account acc3 = new Account(10, 123, "John", "Doe");
		Account acc4 = new Account(11, 908,"Nick", "Smoefv");
		
		
		//add to map
		Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
		accountMap.put(1, acc1);
		accountMap.put(2, acc2);
		accountMap.put(3, acc3);
		accountMap.put(4, acc4);
	
	
	




	

}
	
}
