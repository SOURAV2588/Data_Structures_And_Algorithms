/**
 * 
 */
package com.sourav.problems.inefficientsolutions;

/**
 * @author dell
 *
 */
public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3};
		System.out.println(minimum(arr));
	}
	
	public static int minimum(int[] arr){
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
				break;
			}
		}
		return min;
    }

}
