package org.example;

import java.util.List;


/**
 * Esta interface representa um gráfico direcionado cujos vértices são
 * indexados por 0,...,nVertices()-1
 * G(V,E) é um grafo composto por um conjunto V de vértices e um conjunto E de arestas.
 * cada aresta E é um par ordenado de vértices, onde o primeiro vértice é a origem e o segundo é final.
 */

public interface Graph {
    public int nVertices();
    public void addEdge(int u, int v);
    public void removeEdge(int u, int v);
    public boolean hasEdge(int u, int v);
    public List<Integer> outEdges(int u);
    public List<Integer> inEdges(int u);
    public int outDegree(int u);
    public int inDegree(int u);
}
