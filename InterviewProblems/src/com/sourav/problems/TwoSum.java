/**
 * 
 */
package com.sourav.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Problem 1
 * Difficulty Level : Easy
 * Also Problem 1 in 50 DSA question course in Udemy
 * 
 * @author dell
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		System.out.println(twosum(new int[]{4,5,1,-3,6}, 11));
		System.out.println(twosum(new int[]{4,5,1,-3,6}, -2));
		System.out.println(twosum(new int[]{4,5,1,-3,6}, 8));
	}
	
	private static boolean twosum(int[] arr, int sum) {
		Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();
		for(int a : arr) {
			if(complementMap.containsKey(a)) {
				return true;
			}
			complementMap.put(sum-a, a);
		}
		return false;
	}

}
