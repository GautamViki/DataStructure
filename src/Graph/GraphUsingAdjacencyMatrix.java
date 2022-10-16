package Graph;

public class GraphUsingAdjacencyMatrix {
    private int[][] adjMatrix;
    private int edge;

    private int vtx;

    public GraphUsingAdjacencyMatrix(int node) {
        this.adjMatrix = new int[node][node];
        this.vtx = node;
        this.edge = 0;
    }

    public static void main(String[] args) {
        GraphUsingAdjacencyMatrix graph = new GraphUsingAdjacencyMatrix(4);
        graph.addNode(0, 1);
        graph.addNode(1, 2);
        graph.addNode(2, 3);
        graph.addNode(3, 0);
        System.out.println(graph);
    }

    @Override
    public String toString() {
        System.out.println(vtx + " Vertexes " + edge + " Edges\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vtx; i++) {
            for (int v : adjMatrix[i]) {
                sb.append(v + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addNode(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        edge++;
    }
}
