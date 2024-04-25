package org.example;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix implements Graph {
    private boolean[][] adjacencyMatrix;
    private int numVertices;

    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new boolean[numVertices][numVertices];
    }

    @Override
    public int nVertices() {
        return numVertices;
    }

    @Override
    public void addEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices)
            adjacencyMatrix[u][v] = true;
    }

    @Override
    public void removeEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices)
            adjacencyMatrix[u][v] = false;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices)
            return adjacencyMatrix[u][v];
        else
            return false;
    }

    @Override
    public int inDegree(int u) {
        int inDegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[i][u]) {
                inDegree++;
            }
        }
        return inDegree;
    }

    @Override
    public int outDegree(int u) {
        int outDegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[u][i]) {
                outDegree++;
            }
        }
        return outDegree;
    }

    @Override
    public List<Integer> inEdges(int u) {
        List<Integer> inEdgesList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[i][u]) {
                inEdgesList.add(i);
            }
        }
        return inEdgesList;
    }

    @Override
    public List<Integer> outEdges(int u) {
        List<Integer> outEdgesList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[u][i]) {
                outEdgesList.add(i);
            }
        }
        return outEdgesList;
    }
}