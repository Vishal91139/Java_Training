package DAY_14.graphs.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// count the model of nodes and edges of an undirected graph
public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges = 0;
        for(List<Integer> neighbour : adjList){
            // since it is an undirected graph, edges are counted twice
            // so we divide by 2
            edges += neighbour.size();
        }
        return edges/2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // manually adding the adjacency list representation
        adjList.add(Arrays.asList(1, 2)); // node 1
        adjList.add(Arrays.asList(0, 2, 3)); // node 2
        adjList.add(Arrays.asList(0, 1, 4)); // node 3
        adjList.add(Arrays.asList(1, 4)); // node 4
        adjList.add(Arrays.asList(2, 3)); // node 5

        int nodes = countNodes(adjList);
        System.out.println("No of nodes: "+nodes);

        int edges = countEdges(adjList);
        System.out.println("No of edges: "+edges);
    }
}
