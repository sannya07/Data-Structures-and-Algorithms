public class DP_01 {
    public static int fibb1(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        // tabulation-> bottom-up
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int fibb2(int n, int[] memo){
        if(n==0) return 0;
        if(n==1) return 1;
        // memoization-> up-dowm
        if(memo[n]!= -1) return memo[n];

        memo[n]=fibb2(n-1,memo)+fibb2(n-2,memo);
        return memo[n];
    }

    public static void main(String[] args) {
        // Tabulation: bottom-up
        // memoization: top-down
        // 1) FIBBONACCI
        // 0 1 1 2 3 5 8 13 21 
        System.out.println(fibb1(6));
        int[] memo=new int[8];
        for(int i=0;i<=7;i++){
            memo[i]=-1;
        }
        System.out.println(fibb2(7, memo));


    }
}
