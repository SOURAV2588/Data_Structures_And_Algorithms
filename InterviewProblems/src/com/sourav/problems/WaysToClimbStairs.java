/**
 * 
 */
package com.sourav.problems;

import java.util.Set;

/**
 * @author dell
 *
 */
public class WaysToClimbStairs {

	public static void main(String[] args) {
		System.out.println(waysToClimb(7, Set.of(2, 3, 4)));
	}

	public static int waysToClimb(int n, Set<Integer> possibleSteps) {
		int[] dpArray = new int[n + 1];
		dpArray[0] = 1;
		for (int i = 1; i < n + 1; i++) {
			int wayToReach = 0;
			for (int j : possibleSteps) {
				if (i - j >= 0) {
					wayToReach += dpArray[i - j];
				}
			}
			dpArray[i] = wayToReach;
		}
		return dpArray[n];
	}

}
