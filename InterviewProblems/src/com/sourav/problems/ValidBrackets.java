/**
 * 
 */
package com.sourav.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author dell
 *
 */
public class ValidBrackets {
	
//	private static Map<Character,Character> validInverseBrackets = new HashMap<Character, Character>();
//	private static Set<Character> openingBrackets = new HashSet<Character>();
//	private static Set<Character> closingBrackets = new HashSet<Character>();
//	static {
//		validInverseBrackets.put('(',')');
//		validInverseBrackets.put(')','(');
//		validInverseBrackets.put('{','}');
//		validInverseBrackets.put('}','{');
//		validInverseBrackets.put('[',']');
//		validInverseBrackets.put(']','[');
//		
//		closingBrackets.add(')');
//		closingBrackets.add('}');
//		closingBrackets.add(']');
//		
//		openingBrackets.add('(');
//		openingBrackets.add('{');
//		openingBrackets.add('[');
//	}
	

	public static void main(String[] args) {
		System.out.println(isValid("{()}"));
		System.out.println(isValid("({)}"));
		System.out.println(isValid("[}"));
	}
	
	public static boolean isValid(String str) {
		if (str.length() % 2 != 0) {
			return false;
		}
		Map<Character,Character> validInverseBrackets = new HashMap<Character, Character>();
		validInverseBrackets.put('(',')');
		validInverseBrackets.put('{','}');
		validInverseBrackets.put('[',']');
		Set<Character> openingBrackets = Set.of('(','{','[');
		Stack<Character> bracketStack = new Stack<Character>();
		char[] brackets = str.toCharArray();
		for (int i = 0; i < brackets.length; i++) {
			if(openingBrackets.contains(brackets[i])) {
				bracketStack.push(brackets[i]);
			}else if(bracketStack.size() > 0 && brackets[i] == (validInverseBrackets.get(bracketStack.peek()))) {
				bracketStack.pop();
			}else {
				return false;
			}
		}
		return (bracketStack.size() == 0);
	}

}
