package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("hasEdge(0, 1): " + graph.hasEdge(0, 1));
        System.out.println("hasEdge(1, 2): " + graph.hasEdge(1, 2));
        System.out.println("hasEdge(2, 3): " + graph.hasEdge(2, 3));

        System.out.println("inDegree(4): " + graph.inDegree(4));
        System.out.println("outDegree(2): " + graph.outDegree(2));

        System.out.println("inEdges(3): " + graph.inEdges(3));
        System.out.println("outEdges(0): " + graph.outEdges(0));
    }
}