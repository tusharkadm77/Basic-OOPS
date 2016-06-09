package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void getHashMapValues() {

		//1. Using simple key value pair.
		Map<Integer, String> map = createHashMap();
		
		//Get value from key.
		System.out.println("Map value for key 1: " + map.get(1));

		
		//2. using custom object as key
		Map<Account, String> accountMap = createAccountMap();
		
		Account account = new Account("John", 1, 100);
		
		System.out.println("**********Get value from Map:*********** ");
		System.out.println("Map Value for key as Account: "
				+ accountMap.get(account));
	}

	private static Map<Integer, String> createHashMap() {
		System.out.println("Create map using key as Integer");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		return map;
	}

	private static Map<Account, String> createAccountMap() {
		System.out.println("Create map using key as Custom object Account");
		// Account Object is key.
		Map<Account, String> map = new HashMap<Account, String>();

		map.put(new Account("John", 1, 100), "Saving account");
		map.put(new Account("Sam", 2, 200), "Current account");

		return map;
	}

}
