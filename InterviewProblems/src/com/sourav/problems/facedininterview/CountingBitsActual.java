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
public class CountingBitsActual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printBinary(solution(5));
	}
	
	private static int[] solution(int n) {
		int countOfOne = 0;
		List<Integer> bitList = new ArrayList<Integer>();
		while(n>0) {
			bitList.add(n%2);
			n = n/2;
		}
		int[] result = new int[bitList.size()+1];
		int j = bitList.size();
		for(int i = 0; i < bitList.size(); i++) {
			result[j--] = bitList.get(i);
			if(bitList.get(i) == 1) {
				countOfOne++;
			}
		}
		result[0] = countOfOne;
		return result;
	}
	
	private static void printBinary(int[] binary) {
		for(int i: binary) {System.out.print(i);}
	}

}
