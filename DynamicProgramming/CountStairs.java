public class DP_02 {
    public static int countStairs(int n){
        int[] dp=new int[n+1];
        if(n==0) return 1;
        if(n==1) return 1;
        // Tabulation
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int memocountstairs(int n, int[] memo){
        if(n==0) return 1;
        if(n==1) return 1;

        if(memo[n]!=-1) return memo[n];
        memo[n]=memocountstairs(n-1, memo)+memocountstairs(n-2, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Ways to climb "+n+" stairs: "+countStairs(n));

        int[] memo=new int[n+1];
        for(int i=0;i<=n;i++){
            memo[i]=-1;
        }

        System.out.println("Ways to Climb Stairs: "+memocountstairs(n, memo));
    }
}
