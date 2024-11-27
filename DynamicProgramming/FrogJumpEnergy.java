public class DP_03 {
     public static int frogJumpusingrecurrsion(int index, int[] heights){

        if(index==0) return 0;

        int jump1=frogJumpusingrecurrsion(index-1, heights)+Math.abs(heights[index]-heights[index-1]);

        int jump2=Integer.MAX_VALUE;

        if(index>=2){
            jump2=frogJumpusingrecurrsion(index-2, heights)+Math.abs(heights[index]-heights[index-2]);
        }

        return Math.min(jump1,jump2);
     }


     public static int frogjumpusingDP(int[] heights){
        // Tabulation
        int n=heights.length;

        if(n==1) return 0;
        if(n==2) return Math.abs(heights[1]-heights[0]);

        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(heights[1]-heights[0]);
        for(int i=2;i<n;i++){
            int jump1=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int jump2=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            dp[i]=Math.min(jump1,jump2);
        }
        return dp[n-1];
     }
    public static void main(String[] args) {

        int[] heights={10,20,30,10};
        int n=heights.length;
        System.out.println("Minimum Energy: "+ frogJumpusingrecurrsion(n-1, heights));


    // FROG JUMP
    // Problem statement
    //There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.
    //For Example
    //If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.

    
    }
}
