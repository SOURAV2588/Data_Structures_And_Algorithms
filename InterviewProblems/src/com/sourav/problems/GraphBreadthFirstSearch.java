/**
 * 
 */
package com.sourav.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author dell
 *
 */
public class GraphBreadthFirstSearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void bfs(Graph graph, int root){
		HashMap<Integer,ArrayList<Integer>> adjList = graph.adjList;
		Set<Integer> visited = new HashSet<Integer>();
		List<Integer> queue = new ArrayList<Integer>();
		queue.add(root);
		visited.add(root);
		int i = 0;
		while(i<queue.size()) {
			int vertex = queue.get(i++);
			System.out.print(vertex);
			ArrayList<Integer> itemList = adjList.get(vertex);
			for(int item : itemList) {
				if(!visited.contains(item)) {
					queue.add(item);
					visited.add(item);
				}
			}
		}
    }
	
	static class Graph{
        HashMap<Integer,ArrayList<Integer>> adjList;
        Graph(){this.adjList = new HashMap<>();}
        Graph(HashMap<Integer,ArrayList<Integer>> adjList){this.adjList = adjList;}
    }

}
