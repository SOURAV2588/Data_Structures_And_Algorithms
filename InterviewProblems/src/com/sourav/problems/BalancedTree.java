package com.sourav.problems;

/**
 * Problem 19 in 50 DSA Question course in Udemy
 * @author dell
 *
 */
public class BalancedTree {

	public static void main(String[] args) {
		Tree main = new Tree(5, new Tree(8, new Tree(6, new Tree(9), null), new Tree(7)), new Tree(1, new Tree(2), new Tree(3, null, new Tree(4))));
		
		System.out.println(getHeight(main));
		System.out.println(isBalanced(main));
	}

	public static boolean isBalanced(Tree root) {
		if(root == null) {
			return true;
		}else {
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);
			return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	private static int getHeight(Tree root) {
		if(root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1; 
	}

	static class Tree {
		int data;
		Tree left;
		Tree right;

		Tree(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		Tree(int data, Tree left, Tree right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

}
