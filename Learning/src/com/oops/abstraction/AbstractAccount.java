package com.oops.abstraction;

public abstract class AbstractAccount {
	private double amount;

	private long accountNumber;

	private String accountName;

	public AbstractAccount(String accountName, double amount, long accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	// Need to be implemented by concrete class.
	public abstract double calculateAnnualInterest();

	public double checkBalance() {
		return this.amount;
	}
	

	/**
	 * Function to withdraw amount.
	 * @param amountValue
	 */
	public void withDraw(double amountValue) {
		System.out.println("WithDraw amount: " + amountValue);
		if(this.amount > amountValue) {
			this.amount = this.amount - amountValue;
		}
		
	}
	
	/**
	 * function to deposit amount.
	 * @param amountValue
	 */
	public void deposit(double amountValue) {
		System.out.println("Deposit amount: "+amountValue);
		if(amountValue > 0) {
			this.amount = this.amount + amountValue;
		}
	}
}
