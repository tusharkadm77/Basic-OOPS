package com.oops.abstraction;

public class FixedDepostAccount extends AbstractAccount{

	private String accountType = "Deposit"; // Dont do hard coding of code, it should be dynamic.
	
	private double interestValue = 8;// Dont do hard coding of code, it should be dynamic.
	
	public FixedDepostAccount(String accountName, double amount, long accountNumber) {
		super(accountName, amount, accountNumber);
		
	}

	@Override
	public double calculateAnnualInterest() {
		// TODO Auto-generated method stub
		double amount = checkBalance();
		double interestValue = 0;
		if(amount > 0) {
			interestValue = amount*(interestValue / 100);
		}
		
		return interestValue;
	}
}
