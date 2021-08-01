/**
 * 
 */
package com.sourav.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dell
 *
 */
public class ProductOfArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printArray(productExceptSelf(new int[]{2,5,4,3}));
	}
	
	public static int[] productExceptSelf(int[] arr) {
		int n  =arr.length;
		int[] output = new int[n];
		int[] cumulativeFromLeft = new int[n];
		cumulativeFromLeft[0] = 1;
		int[] cumulativeFromRight = new int[n];
		cumulativeFromRight[n - 1] = 1;
		for(int i = 1; i<n; i++) {
			cumulativeFromLeft[i] = arr[i-1]*cumulativeFromLeft[i-1];
		}
		for(int i = n-2; i>=0; i--) {
			cumulativeFromRight[i] = arr[i+1]*cumulativeFromRight[i+1];
		}
		
		for(int i = 0; i<n; i++) {
			output[i] = cumulativeFromLeft[i]*cumulativeFromRight[i];
		}
		return output;
	}
	
	public static void printArray(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
