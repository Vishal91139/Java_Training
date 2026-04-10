package DAY_14.graphs.representation.matrix;

import java.util.Scanner;

public class GraphMatrixUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // we cover all the nodes, so time complexity is O(n)
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // 0-based indexing
        // lets take input of the edges from the user
        System.out.println("Enter the edges of graph: ");
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // UNdirected graph u <--> v
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; //skip this line for undirected graph
        }
        // print the adjacency matrix
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
