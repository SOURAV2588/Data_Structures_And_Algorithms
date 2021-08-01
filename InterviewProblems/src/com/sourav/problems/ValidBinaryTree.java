package com.sourav.problems;

/**
 * Problem 16 in 50 DSA question in Udemy
 * @author dell
 *
 */
public class ValidBinaryTree {

	public static void main(String[] args) {
		// 16 - 8 - 22 - 3 - 11 - null - null - 1 - 6
		Tree sampleTree = new Tree(16, new Tree(8, new Tree(3, new Tree(1), new Tree(6)), new Tree(11)),new Tree(22));
		System.out.println(isBst(sampleTree));
	}

	public static boolean isBst(Tree root) {
		return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBst(Tree root, int ancFrmLeft, int ancFrmRight) {
		if (root == null) {
			return true;
		} else if (ancFrmLeft >= root.data || ancFrmRight <= root.data) {
			return false;
		} else {
			return (isBst(root.left, ancFrmLeft, root.data) && isBst(root.right, root.data, ancFrmRight));
		}
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
