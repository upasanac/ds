package ds.graph.representation;

import java.io.IOException;

public class AdjacencyMatrix {

    private int vertexCount;
    private boolean[][] adjMatrix;

    public AdjacencyMatrix(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i>=0 && i<vertexCount && j>=0 && j<vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j) {
        if (i>=0 && i<vertexCount && j>=0 && j<vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i>=0 && i<vertexCount && j>=0 && j<vertexCount) {
            return adjMatrix[i][j];
        }
        return false;
    }

    public void printGraph() {
        for (int i=0; i<adjMatrix.length; i++) {
            for (int j=0; j<adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.printGraph();

        System.out.println("\n");
        graph.removeEdge(0,1);
        graph.printGraph();

    }
}
