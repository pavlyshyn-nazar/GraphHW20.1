package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add vertices and edges
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);

        // Print the graph
        graph.printGraph();

        // Remove an edge
        graph.removeEdge(0, 2);

        // Check if an edge exists
        System.out.println(graph.hasEdge(0, 2)); // Should print false

        // Remove a vertex
        graph.removeVertex(1);

        // Check if a vertex exists
        System.out.println(graph.hasVertex(1)); // Should print false
    }
}
