/**
 * 
 */
package com.sourav.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dell
 *
 */
public class AllStringSubsequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] result = getSubsequences("abcd");
		for(String combo : result) {
			System.out.print(combo + " ");
		}
	}
	
	public static String[] getSubsequences(String input) {
		Set<String> subsequences = new HashSet<String>();
		recursiveMethod(input, 0, "", subsequences);
		return subsequences.toArray(new String[subsequences.size()]);
	}
	
	public static void recursiveMethod(String input, int i, String subSequence, Set<String> subsequences) {
		if(i == input.length()) {
			subsequences.add(subSequence);
		}else {
			recursiveMethod(input, i + 1, subSequence + input.charAt(i), subsequences);
			recursiveMethod(input, i + 1, subSequence, subsequences);
		}
	}

}
