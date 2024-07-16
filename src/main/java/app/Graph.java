package app;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjList.containsKey(destination)) {
            addVertex(destination);
        }
        adjList.get(source).add(destination);
    }

    public void removeVertex(int vertex) {
        if (adjList.containsKey(vertex)) {
            adjList.remove(vertex);
            for (List<Integer> neighbors : adjList.values()) {
                neighbors.remove(Integer.valueOf(vertex));
            }
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjList.containsKey(source) && adjList.get(source).contains(destination)) {
            adjList.get(source).remove(Integer.valueOf(destination));
        }
    }

    public boolean hasVertex(int vertex) {
        return adjList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adjList.containsKey(source) && adjList.get(source).contains(destination);
    }

    // For demonstration purposes
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
