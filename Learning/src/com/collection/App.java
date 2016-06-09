package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String... str) {

		
		
		//compareList();
	
		
		HashMapExample.getHashMapValues();
		
	}

	private static void compareList() {
		/**
		 * Internally it store the element in array. [1][2][3]...
		 * 
		 * default size is 10 What is size is full, internally it create a new
		 * array of double size.
		 * 
		 */

		List<Integer> integerList = new ArrayList<Integer>();

		/**
		 * It store the list by pointing the reference to next and prev element.
		 * [1] - > [2] -> [3] <- <-
		 */
		List<Integer> linkedList = new LinkedList<Integer>();

		timeTakenToAddInList("ArrayList", integerList);
		timeTakenToAddInList("LinkedList", linkedList);

	}
	
	private static void timeTakenToAddInList(String type, List<Integer> list) {

		// Add element in list.
		//  1lakh element.
		for (int index = 0; index < 100000; index++) {
			list.add(index);
		}

		//Start time
		long start = System.currentTimeMillis();

		// Add element in list from start.
		for (int index = 0; index < 100000; index++) {
			list.add(0, index);
		}

		//End time
		long end = System.currentTimeMillis();

		System.out.println("Time taken to add element: " + (end - start)
				+ " in list of type " + type);

	}
}
