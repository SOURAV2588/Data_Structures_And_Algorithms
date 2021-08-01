package com.sourav.problems;

/**
 * Leetcode Problem
 * According to the leetcode challenge, this is not a correct solution
 * Difficulty Level : Hard
 * 
 * @author dell
 *
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		//findMedianSortedArrays(new int[] {1,3},new int[] {2});
		//findMedianSortedArrays(new int[] {1,2},new int[] {3,4});
		//findMedianSortedArrays(new int[] {1,3},new int[] {2,4});
		findMedianSortedArrays(new int[] {0,0,0,0,0},new int[] {-1,0,0,0,0,0,1});
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,counter=0;
        double[] merged = new double[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                merged[counter] = nums1[i];
                i++;
            }else if(nums1[i] > nums2[j]){
                merged[counter] = nums2[j];
                j++;
            }else if(nums1[i] == nums2[j]){
                merged[counter++] = nums1[i];
                merged[counter] = nums2[j];
                i++;
                j++;
            }
            counter++;
        }
        while(j<nums2.length){
            merged[counter] = nums2[j];
            j++;
            counter++;
        }
        while(i<nums1.length){
            merged[counter] = nums1[i];
            i++;
            counter++;
        }
        
        for(double d : merged) {
        	System.out.println(d);
        }
        
        if(merged.length%2 == 1){
        	return merged[merged.length/2];
        }else{
        	return (merged[merged.length/2 - 1]+merged[merged.length/2])/2;
        }
        
    }

}
