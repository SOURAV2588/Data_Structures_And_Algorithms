/**
 * 
 */
package com.sourav.problems;

/**
 * @author dell
 *
 */
public class JumpToLastIndex {

	public static void main(String[] args) {
		int[] arr = {3,0,2,0,2,1,4,3};
		int[] arr2 = {5,3,2,0,1,0,4};
		int[] arr3 = {2,2,1,0,1,0,4};
		int[] arr4 = {0,4,3,2};
		int[] arr5 = {5,1,1,0,1};
		int[] arr6 = {6};
		int[] arr7 = {0};
		
		System.out.println(canJump(arr));
		System.out.println(canJump(arr2));
		System.out.println(canJump(arr3));
		System.out.println(canJump(arr4));
		System.out.println(canJump(arr5));
		System.out.println(canJump(arr6));
		System.out.println(canJump(arr7));
	}
	
	public static boolean canJump(int[] arr) {
		if(arr.length == 1) {
			return true;
		}
		int jumpRange = 0 ;
		for (int i = 0; i < arr.length - 1; i++) {
			jumpRange = i + arr[i];
			if (i > jumpRange || (jumpRange == 0)) {
				return false;
			} else if (jumpRange >= arr.length - 1) {
				return true;
			}
		}
		return false;
	}

}
