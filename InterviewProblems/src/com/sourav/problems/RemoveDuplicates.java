package com.sourav.problems;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Given an array of integers arr, create a function 
 * that returns an array containing the values of arr
 * without duplicates (Order does not matter).
 * 
 * For maintaining order - Use LinkedHashSet
 * 
 * Problem from 50 DSA Problem in Udemy
 * 
 * @author dell
 *
 */
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		printElements(removeDuplicates(new int[] {4,2,5,3,3,1,2,4,1,5,5,5,3,1}));
		printElements(removeDuplicates(new int[] {1,1,1,1,1,1,1}));
		printElements(removeDuplicates(new int[] {4,4,2,3,2,2,4,3}));
	}
	
	public static int[] removeDuplicates(int[] arr) {
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		int counter = 0;
		for (int a : arr) {
			if (intSet.contains(a)) {
				continue;
			}
			intSet.add(a);
		}
		int[] nonDups = new int[intSet.size()];
		for(int i : intSet) {
			nonDups[counter++] = i;
		}
		return nonDups;
	}
	
	private static void printElements(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
