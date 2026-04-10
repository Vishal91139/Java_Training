package DAY_14.graphs.representation.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // we cover all the nodes, so time complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // adjacency list represenation
        List<List<Integer>> adjList = new ArrayList<>();
        // if we use
        // initialize to empty list first
        // node 1: {},
        for(int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // undirected graph u <--> v
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for(int i=1; i<=n; i++){
            System.out.println("Node:-> "+i+ ": Neighbours: ");
            for(int v : adjList.get(i)){
                System.out.println(v+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
