package com.collection;

public class Account {

	private String accountName;

	private long accountNumber;

	private double amount;

	public Account(String accountName, long accountNumber, double amount) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public String getAccountName() {
		return accountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	/*@Override
	public int hashCode() {
		System.out.println("Calculate hashCode");
		return this.accountName.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		System.out.println("Compare using equals");
		//Check the cast operation
		if (null != object && object instanceof Account) {
			Account account = (Account) object;
			if (this == account
					|| this.accountName.equals(account.getAccountName())) {
				
				return true;
			}
		}
		return false;
	}*/
}
