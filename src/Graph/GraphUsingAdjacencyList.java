package Graph;

import java.util.LinkedList;

public class GraphUsingAdjacencyList {
    private LinkedList<Integer>[] adjList;
    private int vtx;
    private int edge;

    public GraphUsingAdjacencyList(int node) {
        this.adjList = new LinkedList[node];
        this.vtx = node;
        this.edge = 0;
        for (int i = 0; i < node; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        GraphUsingAdjacencyList graph = new GraphUsingAdjacencyList(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        System.out.println(graph);
    }

    public void addEdge(int u, int v) {
        this.adjList[u].add(v);
        this.adjList[v].add(u);
        edge++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vtx + " vertexes " + edge + " Edges \n");
        for (int i = 0; i < vtx; i++) {
            sb.append(i + " : ");
            for (int v : adjList[i]) {
                sb.append(v + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
