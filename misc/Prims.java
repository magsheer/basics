package Graphs;

import java.util.LinkedList;

public class Prims {
	
	private LinkedList<Integer> adjacencyList[];
	private int numOfVertices;
	
	Prims(int numOfVertices){
		adjacencyList = new LinkedList[numOfVertices];
		
		for(int i=0; i< numOfVertices; i++)
			adjacencyList[i]=new LinkedList<>();
	}
	
	void addEdge(int u, int v) {
		adjacencyList[u].add(v);
	}
	
	void DFS(int v, boolean visited[]) {
		
	}

	void getDFS(int source) {
		
		boolean visited[] = new boolean[numOfVertices];
		
		DFS(source, visited);
	}
}
