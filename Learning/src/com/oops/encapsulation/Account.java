package com.oops.encapsulation;

// With encapsulation.
public class Account {
	private int amount;
	
	private int accountNumber;
	
	/**
	 * Function to withdraw amount.
	 * @param amountValue
	 */
	public void withDraw(int amountValue) {
		System.out.println("WithDraw amount: " + amountValue);
		if(this.amount > amountValue) {
			this.amount = this.amount - amountValue;
		}
		
	}
	
	/**
	 * function to deposit amount.
	 * @param amountValue
	 */
	public void deposit(int amountValue) {
		System.out.println("Deposit amount: "+amountValue);
		if(amountValue > 0) {
			this.amount = this.amount + amountValue;
		}
	}
	
	public int checkBalance() {
		return this.amount;
	}
}
