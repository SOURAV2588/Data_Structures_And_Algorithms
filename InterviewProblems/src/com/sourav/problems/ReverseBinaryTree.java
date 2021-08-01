package com.sourav.problems;

/**
 * TODO Write test cases in main
 * TODO Write an inOrderTraversal to get the proper order of the tree
 * 
 * @author dell
 *
 */
public class ReverseBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reverseTree(Tree root){
		if(root == null) {
			return;
		}
		Tree left = root.left;
		Tree right = root.right;
		root.left = right;
		root.right = left;
		reverseTree(root.left);
		reverseTree(root.right);
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
