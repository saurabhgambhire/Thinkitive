package com.thinkitive.datastructure.Graphs;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex start, Vertex end, Integer weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
