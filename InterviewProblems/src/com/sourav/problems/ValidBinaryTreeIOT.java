package com.sourav.problems;

public class ValidBinaryTreeIOT {

	public static void main(String[] args) {
		// 16 - 8 - 22 - 3 - 11 - null - null - 1 - 6
		Tree sampleTree = new Tree(16, new Tree(8, new Tree(3, new Tree(1), new Tree(6)), new Tree(11)),new Tree(22));
		System.out.println(isBst(sampleTree));
	}

	public static boolean isBst(Tree root) {
		return isBst(root, Integer.MIN_VALUE);
	}
	
	public static boolean isBst(Tree root, int precedent) {
		if (root == null) {
			return true;
		}
		// is left smaller than precedent?
		if (!isBst(root.left, precedent)) {
			return false;
		}
		if(root.data <= precedent) {
			return false;
		}else {
			precedent = root.data;
		}
		// is right smaller than precedent?
		if (!isBst(root.right, precedent)) {
			return false;
		}
		return true;
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
