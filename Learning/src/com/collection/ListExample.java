package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	
	private static void createArrayList() {
		
		// We used generic list to store specific type of element.
		// [0]-> [1] -> [2]
		List<Account> accountList = new ArrayList<Account>();
		
		accountList.add(new Account("John", 1, 100));
		accountList.add(new Account("Sam", 1, 100));
		accountList.add(new Account("Johny", 1, 100));
		
		
		System.out.println("Print List");
		
		//1st way to iterate using for loop
		//As we are using generic, so we are sure list contains only account.
		for(Account account: accountList) {
			System.out.println("Account Name: "+ account.getAccountName());
			//accountList.remove(account);
		}
		
		System.out.println("Using while loop.");
		Iterator<Account> accountIterator = accountList.iterator();
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			System.out.println("Account Name: "+ account.getAccountName());
			//accountIterator.remove();
		}
		
		//For loop gives error while modifying the collection while iterating.
		// to avoid that iterator provides method to remove element while iterating.
	}
	
	private static void createLinkedList() {

		//Store element by point reference to next and prev element.
		// [0] -> [1] -> [2]
		//     <-     <-
		List<Account> accountList = new LinkedList<Account>();
		
		accountList.add(new Account("John", 1, 100));
		accountList.add(new Account("Sam", 1, 100));
		accountList.add(new Account("Johny", 1, 100));
		
		
		System.out.println("Print List");
		
		
		//1st way to iterate using for loop
		//As we are using generic, so we are sure list contains only account.
		for(Account account: accountList) {
			System.out.println("Account Name: "+ account.getAccountName());
		}
		
		System.out.println("Using while loop.");
		Iterator<Account> accountIterator = accountList.iterator();
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			System.out.println("Account Name: "+ account.getAccountName());
		}
		
	}
	

}
