import java.util.*;

public class BFS {

    public static void bfsTraversal(List<List<Integer>> adjacencyList, int startVertex, int vertices){
        boolean[] visited= new boolean[vertices];
        Queue<Integer> queue= new LinkedList<>();
        
        visited[startVertex]=true;
        queue.add(startVertex);

        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.print(current+" ");

            for(int element: adjacencyList.get(current)){
                if(!visited[element]){
                    visited[element]=true;
                    queue.add(element);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=input.nextInt();

        System.out.println("Enter the number of edges");
        int edges=input.nextInt();

        List<List<Integer>> adjacencyList=new ArrayList<>(vertices+1);

        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (source and destination)");
        for(int i=0;i<edges;i++){
            int source=input.nextInt();
            int destination=input.nextInt();
            adjacencyList.get(source).add(destination);
            // For Undirected Graph
            adjacencyList.get(destination).add(source);
        }

            System.out.println("Enter the starting vertex for BFS:");
            int startVertex = input.nextInt();
    
            System.out.println("BFS Traversal");
            bfsTraversal(adjacencyList, startVertex, vertices);

        
    }
}
