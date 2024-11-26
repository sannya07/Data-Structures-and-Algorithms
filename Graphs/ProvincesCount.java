import java.util.ArrayList;

public class ProvincesCount {
    // Depth-first search (DFS) to visit all nodes in the current province
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] vis) {
        vis[node] = 1;  // Mark the node as visited
        for (Integer it : adjList.get(node)) {
            if (vis[it] == 0) {  // If the node is not visited
                dfs(it, adjList, vis);  // Recursively visit the node
            }
        }
    }

    // Function to count the number of provinces
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        // Initialize the adjacency list for each node
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {  // If there's a connection and it's not the same node
                    adjList.get(i).add(j);  // Add node j to node i's adjacency list
                    adjList.get(j).add(i);  // Add node i to node j's adjacency list (undirected graph)
                }
            }
        }

        int[] vis = new int[V];  // Visited array
        int count = 0;  // Province count

        // Traverse all nodes
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {  // If the node is unvisited, it's a new province
                count++;  // Increment province count
                dfs(i, adjList, vis);  // Perform DFS to mark all connected nodes
            }
        }

        return count;  // Return the number of provinces
    }
    public static void main(String[] args) {
        int V = 5;  // Number of nodes (vertices)
    
        // Example adjacency matrix (5 nodes)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
        // Initialize the adjacency matrix (5x5) with 0s (no connections)
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < V; j++) {
                adj.get(i).add(0);  // Initially set all elements to 0
            }
        }
    
        // Create the adjacency matrix (Undirected graph)
        // Representing the graph:
        // 0 is connected to 1
        // 2 is connected to 3
        adj.get(0).set(1, 1);
        adj.get(1).set(0, 1);
        adj.get(2).set(3, 1);
        adj.get(3).set(2, 1);
    
        // Call the function to count the number of provinces
        System.out.println("Number of provinces: " + numProvinces(adj, V));  // Output: 2
    }
    
}
