package com.sourav.problems;

/**
 * Problem 13 of 50 DSA Question Udemy course
 * Very important concept introduced : LPS Array
 * 
 * @author dell
 *
 */
public class SubStringIndex {

	public static void main(String[] args) {
		System.out.println(substrIndex("inside", "side"));
		System.out.println(substrIndex("inside", "in"));
		System.out.println(substrIndex("inside", "code"));
		System.out.println(substrIndex("b", "b"));
		System.out.println(substrIndex("bababba", "abb"));
	}
	
	public static int substrIndex(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		if (m > n) {
			return -1;
		}
		if (m == n) {
			if (str1.equalsIgnoreCase(str2)) {
				return 0;
			} else {
				return -1;
			}
		}
		if (str2 == "") {
			return 0;
		}

		int[] lpsArr = lpsArray(str2);
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (str1.charAt(i) == str2.charAt(j)) {
				i++;
				j++;
			} else if (j > 0) {
				j = lpsArr[j - 1];
			} else {
				i++;
			}
		}
		if (m <= j) {
			return i - j;
		}
		return -1;
	}
	
	/**
	 * This is creating the longest-prefix-suffix(lps) array
	 * 
	 * @param str
	 */
	public static int[] lpsArray(String str) {
		int[] lpsArr = new int[str.length()];
		int length = 0;
		int i = 1;
		while(i < str.length()) {
			if(str.charAt(i) == str.charAt(length)) {
				length++;
				lpsArr[i] = length;
				i++;
			}else if(length>0) {
				length = lpsArr[length - 1];
			}else {
				lpsArr[i] = 0;
				i++;
			}
		}
		return lpsArr;
	}

}
