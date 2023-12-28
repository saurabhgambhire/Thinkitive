package com.thinkitive.datastructure.Graphs;

import java.util.ArrayList;

public class Vertex {

    private String data;
    private ArrayList<Edge> edges;

    Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<>();
    }
}
