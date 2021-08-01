package com.sourav.dsimpl;

public class TestApp {
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(10);
		bst.insert(40);
		bst.insert(20);
		bst.insert(20);
		bst.insert(50);
		bst.insert(30);
		
		System.out.println(bst.getMin());
		System.out.println(bst.getMax());
		
		bst.traversal();
	}

}
