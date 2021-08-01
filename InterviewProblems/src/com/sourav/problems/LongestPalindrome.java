package com.sourav.problems;

/**
 * Problem 12 in 50 DSA course in Udemy
 * @author dell
 *
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbaba"));
		System.out.println(longestPalindrome("abbaaa"));
		System.out.println(longestPalindrome("abbabab"));
		System.out.println(longestPalindrome("abdccdceeebebc"));
	}
	
	public static int longestPalindrome(String str){
		int possibleMaxLength = 0;
		boolean[] charOddFreq = new boolean[26];
		char[] chars = str.toLowerCase().toCharArray();
		for(char c : chars) {
			if(charOddFreq[c-97] == true) {
				possibleMaxLength+=2;
				charOddFreq[c-97] = false;
			}else {
				charOddFreq[c-97] = true;
			}
		}
		if(possibleMaxLength < str.length()) {
			possibleMaxLength++;
		}
		return possibleMaxLength;
    }

}
