//choice is we can climb 1 or 2 stairs at once. count total possible ways to climb nth stair
import java.util.*;
public class climbingStairs{
    public static int ways_memoin(int n,int dp[]){
        if(n==0)
        return 1;
        if(n<0)
        return 0;
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=ways_memoin(n-1,dp)+ways_memoin(n-2,dp);
        return dp[n];
    }
    public static int  ways_tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(ways_memoin(n,dp));
        System.out.println(ways_tabulation(n));

    }
}