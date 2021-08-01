package com.sourav.problems.sampleapproches;

public class SlidingWindow {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aa"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("ckilbkd"));
		System.out.println(lengthOfLongestSubstring("tmmzuxt"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int[] chars = new int[128];
		
		int left = 0, right = 0;
		int res = 0;
		while(right < s.length()) {
			char r = s.charAt(right);
			chars[r]++;
			
			while(chars[r]>1) {
				char l = s.charAt(left);
				chars[l]--;
				left++;
			}
			
			res = Math.max(res, right - left + 1);
			right++;
		}
		
        return res;
    }

}
