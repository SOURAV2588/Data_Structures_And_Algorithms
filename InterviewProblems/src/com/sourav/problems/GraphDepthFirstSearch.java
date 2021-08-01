/**
 * 
 */
package com.sourav.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author dell
 *
 */
public class GraphDepthFirstSearch {

	public static void main(String[] args) {
		HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public static void dfs(Graph graph, int root){
		HashMap<Integer,ArrayList<Integer>> adjList = graph.adjList;
		Set<Integer> visited = new HashSet<Integer>();
		visitNode(adjList, root, visited);
    }
	
	private static void visitNode(HashMap<Integer,ArrayList<Integer>> adjList, int root, Set<Integer> visited) {
		System.out.print(root + " ");
		visited.add(root);
		ArrayList<Integer> linkedNodes = adjList.get(root);
		for(int linkedNode : linkedNodes) {
			if(!visited.contains(linkedNode)) {
				visitNode(adjList, linkedNode, visited);
			}
		}
	}

    static class Graph{
        HashMap<Integer,ArrayList<Integer>> adjList;
        Graph(){this.adjList = new HashMap<>();}
        Graph(HashMap<Integer,ArrayList<Integer>> adjList){this.adjList = adjList;}
    }
}
