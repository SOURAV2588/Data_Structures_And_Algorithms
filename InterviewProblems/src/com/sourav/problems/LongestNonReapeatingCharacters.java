package com.sourav.problems;

public class LongestNonReapeatingCharacters {

	public static void main(String[] args) {
		System.out.println(longestNonRepeating("abcdbeghef"));
		System.out.println(longestNonRepeating("aaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbb"));
	}
	
	public static int longestNonRepeating(String str) {
		str = str.toLowerCase();
		char[] chars = str.toCharArray();
		int[] alphabetsIndex = new int[26];
		int maxLength = 0;
		int left = 0;
		int right = 0;
		
		for(int i = 0; i<alphabetsIndex.length; i++) { alphabetsIndex[i] = -1;}
		
		for(right = 0; right<chars.length; right++) {
			
			if(alphabetsIndex[(int)str.indexOf(chars[right])] >= left) {
				left = alphabetsIndex[(int)str.indexOf(chars[right])] + 1;
			}
			alphabetsIndex[(int)str.indexOf(chars[right])] = right;
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

}
