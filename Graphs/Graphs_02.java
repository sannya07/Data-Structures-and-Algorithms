
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graphs_02 {
    public static void main(String[] args) {
        // taking input by Adjacency List

        // for weighted graphs add the weights as well
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=input.nextInt();
        System.out.println("Enter the number of edges");
        int edges=input.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("Enter the values of edges");
        for(int i=0;i<edges;i++){
            int source=input.nextInt();
            int destination=input.nextInt();

            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);
        }
        System.out.println("Adjacency List: ");
        for(int i=0;i<vertices;i++){
            System.out.print(i+"-> ");
            for(int e:adjacencyList.get(i)){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
