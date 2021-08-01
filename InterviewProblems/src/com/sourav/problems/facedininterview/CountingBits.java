/**
 * 
 */
package com.sourav.problems.facedininterview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dell
 *
 */
public class CountingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(convertToBinary(16));
//		System.out.println(convertToBinary(32));
//		System.out.println(convertToBinary(5));
		printBinary(convertToBinaryInt(5));
	}
	
	private static String convertToBinary(int n) {
		StringBuilder binary = new StringBuilder();
		int[] binaryInt = new int[n];
		int i = 0;
		while(n>0) {
			binaryInt[i++] = n%2;
//			if(n%2==0) {
//				binary.append("1");
//			}else {
//				binary.append("0");
//			}
//			System.out.println(n);
			n = n/2;
		}
		return binary.toString();
	}
	
	private static List<Integer> convertToBinaryInt(int n) {
		List<Integer> binaryInt = new ArrayList<Integer>();
		while(n>0) {
			binaryInt.add(n%2);
			n = n/2;
		}
		return binaryInt;
	}
	
	private static void printBinary(List<Integer> binaryInt) {
		for(int i : binaryInt) { System.out.print(i);}
	}

}
