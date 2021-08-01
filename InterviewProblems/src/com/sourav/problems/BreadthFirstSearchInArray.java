/**
 * 
 */
package com.sourav.problems;

import java.util.ArrayList;

/**
 * Try to find atleast a optimal looking solution
 * @author dell
 *
 */
public class BreadthFirstSearchInArray {

	public static void main(String[] args) {
		Tree main = new Tree(2, new Tree(1), new Tree(3));
		Tree main2 = new Tree(5,new Tree(10,new Tree(4,new Tree(8),null),new Tree(6,new Tree(9),new Tree(1))),new Tree(3,null,new Tree(7,new Tree(2),null)));
		System.out.println(getValuesByLevel(main));
		System.out.println(getValuesByLevel(main2));
	}

	public static ArrayList<ArrayList<Integer>> getValuesByLevel(Tree root) {
		ArrayList<ArrayList<Integer>> completeList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> rootLevelList = new ArrayList<Integer>();
		rootLevelList.add(root.data);
		completeList.add(rootLevelList);
		getlistForSingleLevel(root, completeList, 1);
		return completeList;
	}
	
	private static void getlistForSingleLevel(Tree root, ArrayList<ArrayList<Integer>> completeList, int level) {
		if(root==null) {
			return;
		}
		System.out.println("Root : " + root.data);
		System.out.println("level : " + level);
		ArrayList<Integer> singleLevelList = new ArrayList<Integer>();
		boolean modified = false;
		if(completeList.size() > level) {
			singleLevelList = completeList.get(level);
			modified = true;
		}
		if(root.left!=null) {
			singleLevelList.add(root.left.data);
		}
		if(root.right!=null) {
			singleLevelList.add(root.right.data);
		}
		if(!modified && (root.left!=null || root.right!=null)) {
			completeList.add(singleLevelList);
		}
		System.out.println("completeList : " + completeList);
		level++;
		getlistForSingleLevel(root.left, completeList,level);
		getlistForSingleLevel(root.right, completeList, level);
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
