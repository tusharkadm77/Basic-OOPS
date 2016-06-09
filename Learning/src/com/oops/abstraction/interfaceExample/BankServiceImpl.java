package com.oops.abstraction.interfaceExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oops.abstraction.AbstractAccount;
import com.oops.abstraction.FixedDepostAccount;
import com.oops.abstraction.SavingAccount;
import com.util.StringConstant;

public class BankServiceImpl implements BankService {

	private Map<Long, AbstractAccount> accountMap = new HashMap<Long, AbstractAccount>();

	@Override
	public AbstractAccount createAccount(String accountType,
			String accountName, double amount, long accountNumber) {

		AbstractAccount account = null;
		if (null != accountType) {

			if (accountType.equals(StringConstant.SAVING_ACCOUNT)) {
				account = new SavingAccount(accountName, amount, accountNumber);
				accountMap.put(accountNumber, account);
				
			} else if (accountType.equals(StringConstant.FIXED_DEPOSIT_ACCOUNT)) {
				
				account = new FixedDepostAccount(accountName, amount,
						accountNumber);

				accountMap.put(accountNumber, account);
			} else {
				// Throw Exception
			}
		}
		return account;
	}

	@Override
	public void withDrawAmount(long accountNumber, double amount) {
		// Get account from account Number
		AbstractAccount account = accountMap.get(accountNumber);

		if (null != account) {
			account.withDraw(amount);
		}
	}

	@Override
	public void depositAmount(long accountNumber, double amount) {
		// Get account from account Number
		AbstractAccount account = accountMap.get(accountNumber);

		if (null != account) {
			account.deposit(amount);
		}

	}

	@Override
	public double checkBalance(long accountNumber) {
		// Get account from account Number
		AbstractAccount account = accountMap.get(accountNumber);

		if (null != account) {
			return account.checkBalance();
		}

		return 0;
	}

	@Override
	public List<AbstractAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return (List<AbstractAccount>) accountMap.values();
	}

}
