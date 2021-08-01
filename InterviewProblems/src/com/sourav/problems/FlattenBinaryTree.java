/**
 * 
 */
package com.sourav.problems;

/**
 * @author dell
 *
 */
public class FlattenBinaryTree {
	
	static Tree head = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void flattenTree(Tree root){
		if(root == null) {
			return;
		}
		flattenTree(root.right);
		flattenTree(root.left);
		root.right = head;
		root.left = null;
		head = root;
    }
	
	static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }
    
}