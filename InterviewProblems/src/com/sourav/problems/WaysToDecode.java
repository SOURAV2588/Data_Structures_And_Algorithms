/**
 * 
 */
package com.sourav.problems;

/**
 * @author dell
 *
 */
public class WaysToDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int waysToDecode(String str) {
		int n = str.length();
		if(n == 0 || str.charAt(0) == '0') {
			return 0; 
		}
		int beforePrevious = 1;
		int previous = 1;
		
		for(int i = 1; i <n; i++) {
			int current = 0;
			if(str.indexOf(i) != '0') {
				current+=previous;
			}
			String twoDigit = String.valueOf(str.charAt(i-1)) + String.valueOf(str.charAt(i));
			if(10 <= Integer.valueOf(twoDigit) && Integer.valueOf(twoDigit) <= 26) {
				current+=beforePrevious;
			}
			beforePrevious = previous;
			previous = current;
		}
		return previous;
	}

}
