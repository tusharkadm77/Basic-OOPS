package com.oops.abstraction;

public class SavingAccount extends AbstractAccount{

	private String accountType = "Saving"; // Dont do hard coding of code, it should be dynamic.
	
	private double interestValue = 6;// Dont do hard coding of code, it should be dynamic.
	
	public SavingAccount(String accountName, double amount, long accountNumber) {
		super(accountName, amount, accountNumber);
		
	}

	@Override
	public double calculateAnnualInterest() {
		// TODO Auto-generated method stub
		double amount = checkBalance();
		System.out.println("Calculate interset on amount: " +amount);
		double interestValue = 0;
		if(amount > 0) {
			interestValue = amount * (this.interestValue / 100);
			System.out.println("interestValue: " +interestValue);
		}
		
		return interestValue;
	}
}
