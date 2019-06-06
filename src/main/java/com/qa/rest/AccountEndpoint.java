package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.AccountService;


@Path("/account")
public class AccountEndpoint {

	@Inject
	private AccountService service;
	
	
	@Path("/getAllAccounts")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllAccounts();
	}
	
	
	
	@Path("/findAnAccount/{id}")
	@GET
	@Produces({ "application/json" })
	public String findAnAccount(@PathParam("accountNumber") int accountNumber) {
		return service.findAnAccount(accountNumber);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String createAccount(String account) {
		return service.createAccount(account);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("account") String account) {
		return service.deleteAccount(account);
	}
	
	@Path("/updateAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("accountUpdate") int accountNumber, String account) {
		return service.updateAccount(accountNumber, account);
	}

	
	
}
