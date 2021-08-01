package com.sourav.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 14 in 50 DSA question in Udemy
 * Solution is not satisfactory for me
 * @author dell
 *
 */
public class BreadthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }
    
	public static void bfs(Tree root) {
		List<Tree> queue = new ArrayList<BreadthFirstSearch.Tree>();
		queue.add(root);
		int i = 0;
		while(i < queue.size()) {
			Tree poppedNode = queue.get(i++);
			if(poppedNode!=null) {
				System.out.println(poppedNode.data);
				queue.add(poppedNode.left);
				queue.add(poppedNode.right);
			}
		}
		
	}


}
