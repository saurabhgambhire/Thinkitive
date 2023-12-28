package com.thinkitive.datastructure.Graphs;

import java.util.ArrayList;

public class Graphs {
    static class Edge {
        int source;
        int destination;

        Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void main(String[] args) {
        int vertex = 4;

        ArrayList<Edge> graphs[] = new ArrayList[vertex];

        createGraph(graphs);

        for (int i = 0; i < graphs.length; i++) {
            Edge edge = graphs[i].get(i);
            System.out.print(" - > " + edge.destination);

        }

    }

    private static void createGraph(ArrayList<Edge>[] graphs) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<Edge>();
        }
        graphs[0].add(new Edge(0, 1));

        graphs[1].add(new Edge(1, 2));
        graphs[1].add(new Edge(1, 3));
        graphs[0].add(new Edge(2, 1));
        graphs[0].add(new Edge(2, 3));
    }


}
