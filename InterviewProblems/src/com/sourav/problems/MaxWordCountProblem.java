package com.sourav.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Encountered in exam of Wolters-Kluwer
 * Not a correct solution
 * 
 * @author dell
 *
 */
public class MaxWordCountProblem {
	
	private static int sentenceCount;
	private static int sentenceWordCount;
	private static int maxWordCount;
	
//	private static final String sampleString = "This is a test String. This is supposed to be a really"
//			+ " hard problem! You ask why? Because these sentences you see, are not "
//			+ "ending consistently.";
	private static final String sampleString = " All Boys Can Dance ";

	public static void main(String[] args) {
		
		boolean isWordEnding = true;
		
		if(sampleString.trim().isEmpty()) {
			System.out.println("Invalid senence");
			return;
		}
		
		Set<Character> endingCharSet = new HashSet<>();
		endingCharSet.add('.');
		endingCharSet.add('!');
		endingCharSet.add('?');
		
		char[] testCharArray = sampleString.toCharArray();
		
		for(int i=0; i<testCharArray.length; i++) {
			
			if(testCharArray[i] != ' ' && !endingCharSet.contains(testCharArray[i])) {
				if(isWordEnding == true) {
					sentenceWordCount++;
					isWordEnding = false;
				}
			}
			
			if(testCharArray[i] == ' ') {
				isWordEnding = true;
			}
			
			
			if (endingCharSet.contains(testCharArray[i])) {
				sentenceCount++;
				if (maxWordCount < sentenceWordCount) {
					maxWordCount = sentenceWordCount;
				}
				sentenceWordCount = 0;
			}
		}
		
		System.out.println("Number of sentences : " + sentenceCount);
		System.out.println("Longest Sentence with " + maxWordCount + " words");
		resetAll();
	}
	
	public static void resetAll() {
		sentenceCount = 0;
		sentenceWordCount = 0;
		maxWordCount = 0;
	}

}
