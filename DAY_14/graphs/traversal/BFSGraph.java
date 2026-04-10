package DAY_14.graphs.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList){
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        // start the bfs from the node 1
        visited[1] = true;
        q.add(1);
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node); // we are atoring the output one by one
            //  who are tou neighbours [adjacency list]
            // traverse all of its neighbours if not visited
            for(int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true; // mark as value
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}

public class BFSGraph {
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected u <--> v
    }
    // method to print the bfs result
    public static void printBFS(List<Integer> ans){
        for(int num : ans){
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5; // Number of nodes
        List<List<Integer>> adjList = new ArrayList<>();
        // if we use
        // initialize to empty list first
        // node 1: {}, node 2: {}, Node 3: {}
        for(int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        // adding the edges(undirected graph)
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 4, 5);
        addEdge(adjList, 2, 5);

        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V, adjList);
        printBFS(ans);
    }
}
