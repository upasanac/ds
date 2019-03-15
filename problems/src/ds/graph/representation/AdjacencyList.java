package ds.graph.representation;

import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {

    private int vertexCount;
    private List<Integer> adjList[];

    public AdjacencyList(int vertexCount) {
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i=0; i<vertexCount; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        if (i>=0 && i<adjList.length && j>=0 && j<adjList.length) {
            adjList[i].add(j);
            adjList[j].add(i);
        }
    }

    public void removeEdge(int i, int j) {
        if (i>=0 && i<adjList.length && j>=0 && j<adjList.length) {
            if (adjList[i].contains(j)) {
                adjList[i].remove(new Integer(j));
            }
            if (adjList[j].contains(i)) {
                adjList[j].remove(new Integer(i));
            }
        }
    }

    public boolean isEdge(int i, int j) {
        if (i>=0 && i<adjList.length && j>=0 && j<adjList.length) {
            return adjList[i].contains(j) && adjList[j].contains(i);
        }
        return false;
    }

    public void printGraph() {
        for (List list: adjList) {
            System.out.println(list);
        }
    }

    public static void main(String args[]) {
        AdjacencyList graph = new AdjacencyList(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.printGraph();

        System.out.println("\n");
        graph.removeEdge(0,1);
        graph.printGraph();


        System.out.println("\n");
        graph.removeEdge(2,3);
        graph.printGraph();
    }
}
