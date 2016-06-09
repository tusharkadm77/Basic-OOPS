package com.oops.abstraction.interfaceExample;

import java.util.List;

import com.oops.abstraction.AbstractAccount;

public interface BankService {

	public AbstractAccount createAccount(String accountType, String accountName, double amount, long accountNumber);
	
	public void withDrawAmount(long accountNumber, double amount);
	
	public void depositAmount(long accountNumber, double amount);
	
	public double checkBalance(long accountNumber);
	
	public List<AbstractAccount> getAllAccounts();
	
}
