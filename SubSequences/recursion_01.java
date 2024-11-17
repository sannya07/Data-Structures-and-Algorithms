import java.util.ArrayList;

public class recursion03 {
    // Print All Subsequences 
    public static void printSubsequence(int[] arr, int index, ArrayList<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        printSubsequence(arr, index+1, current);

        current.remove(current.size()-1);
        printSubsequence(arr, index+1, current);
 
    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        System.out.println("All subsequences:");
        printSubsequence(arr, 0, new ArrayList<Integer>());
        
    }
}