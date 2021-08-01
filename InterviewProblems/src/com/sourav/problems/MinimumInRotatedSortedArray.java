/**
 * 
 */
package com.sourav.problems;

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
		int left = 0;
		int right = arr.length-1;
		
		if(arr[right] > arr[left]) {
			return arr[left];
		}
		
		int mid = 0;
		while(right < left) {
			mid = (left + right)/2;
			if(arr[mid - 1] > arr[mid]) {
				return arr[mid]; 
			}else if(arr[mid + 1] < arr[mid]) {
				return arr[mid + 1]; 
			} else if(arr[left] > arr[mid]) {
				right = mid - 1; 
			} else if(arr[mid] > arr[right]) {
				left = mid + 1; 
			}
		}
		return arr[left];
	}

}
