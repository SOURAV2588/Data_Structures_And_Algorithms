/**
 * 
 */
package com.sourav.problems.inefficientsolutions;

/**
 * @author dell
 *
 */
public class FlattenBinaryTree {

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
		flattenTree(root.left);
		flattenTree(root.right);
		Tree rightSubTree = root.right;
		root.right = root.left;
		root.left = null;
		Tree temp = root;
		while(temp.right!=null) {
			temp = temp.right;
		}
		temp.right = rightSubTree;
    }
	
	static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }
    
}