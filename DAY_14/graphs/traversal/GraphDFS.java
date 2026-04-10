package DAY_14.graphs.traversal;

import java.util.ArrayList;
import java.util.List;

public class GraphDFS {
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans){
        visited[node] = true;
        ans.add(node);
        // traverse the neighbours if not visited and do a dfs call
        for(int neighbour : adjList.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, adjList, visited, ans);
            }
        }
    }

    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited = new boolean[V+1];
        List<Integer> ans = new ArrayList<>();
        int start=1;
        dfs(start, adjList, visited, ans);
        return ans;
    }

}

class DFSGraph {
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected u <--> v
    }
    // method to print the bfs result
    public static void printDFS(List<Integer> ans){
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
        addEdge(adjList, 2, 4);
        addEdge(adjList, 4, 5);
        addEdge(adjList, 2, 5);

        GraphDFS obj = new GraphDFS();
        List<Integer> ans = obj.dfsGraph(V, adjList);
        printDFS(ans);
    }
}
