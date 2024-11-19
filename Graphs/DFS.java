import java.util.*;

public class DFS {
    // DFS method
    public static void DepthFirstSearch(List<List<Integer>> adjacencyList, int startVertex, boolean[] visited, ArrayList<Integer> result) {
        // Mark the current vertex as visited
        visited[startVertex] = true;
        result.add(startVertex);

        // Recur for all adjacent vertices
        for (int neighbor : adjacencyList.get(startVertex)) {
            if (!visited[neighbor]) {
                DepthFirstSearch(adjacencyList, neighbor, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = input.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = input.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < edges; i++) {
            int source = input.nextInt();
            int destination = input.nextInt();

            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // For undirected graph
        }

        // Printing the adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // Perform DFS and print the traversal
        System.out.println("Enter the starting vertex for DFS:");
        int startVertex = input.nextInt();

        boolean[] visited = new boolean[vertices];
        ArrayList<Integer> result = new ArrayList<>();
        DepthFirstSearch(adjacencyList, startVertex, visited, result);

        System.out.println("DFS Traversal:");
        for (int vertex : result) {
            System.out.print(vertex + " ");
        }
        input.close();
    }
}
