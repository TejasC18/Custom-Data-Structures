package graph;

import java.util.*;

public class Graph
{
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;

	public Graph(ArrayList<GraphNode> nodeList)
	{
		this.nodeList = nodeList;
		// if we give nodeList = 5 then it will create the 5X5 size of matrix will be
		// created
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	// int i variable is the index of the first node
	// int j variable is the index of the second node
	public void addUndirectedEdge(int i, int j)
	{
		// creating an edge from i to j and j to i of the node
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}

	// printing graph to console
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("  ");
		for (int i = 0; i < nodeList.size(); i++)
		{
			s.append(nodeList.get(i).name + " ");
		}
		s.append("\n");
		for (int i = 0; i < nodeList.size(); i++)
		{
			s.append(nodeList.get(i).name + ":");
			for (int j : adjacencyMatrix[i])
			{
				s.append(((j) + " "));
			}
			s.append("\n");
		}

		return s.toString();
	}
}
