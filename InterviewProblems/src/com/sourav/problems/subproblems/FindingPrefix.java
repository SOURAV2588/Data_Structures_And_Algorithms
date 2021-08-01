/**
 * 
 */
package com.sourav.problems.subproblems;

/**
 * @author dell
 *
 */
public class FindingPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(commonPrefix("doge","coin"));
		System.out.println(commonPrefix("sourav","sour"));
	}
	
	private static String commonPrefix(String left,String right) {
	    int min = Math.min(left.length(), right.length());       
	    for (int i = 0; i < min; i++) {
	        if ( left.charAt(i) != right.charAt(i) )
	            return left.substring(0, i);
	    }
	    return left.substring(0, min);
	}

}
