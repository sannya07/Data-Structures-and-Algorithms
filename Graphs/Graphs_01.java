
import java.util.Scanner;

public class Graphs_01 {
    public static void main(String[] args) {
        // inputing an adjacency matrix for an undirected graph
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=input.nextInt();
        int[][] adjacencyMatrix=new int[vertices+1][vertices+1];
        System.out.println("Enter the number of edges");
        int edges=input.nextInt();
        System.out.println("Enter the values of edges");
        for(int i=0;i<edges;i++){
            int source=input.nextInt();
            int destination=input.nextInt();

            adjacencyMatrix[source][destination]=1;
            adjacencyMatrix[destination][source]=1;
        }
        // displaying an adjacency matrix
        for(int i=1;i<=vertices;i++){
            for(int j=1;j<=vertices;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
