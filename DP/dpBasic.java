public class dpBasic{
    public static int fib_memoization(int n,int f[]){//O(n)
        if(n==0||n==1){
            return n;
        }
        if(f[n]!=0){//if already calculated
            return f[n];
        }
        f[n]=fib_memoization(n-1,f)+fib_memoization(n-2,f);
        return f[n];
    }
    public static int fib_tabulation(int n){// O(n)
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;//5'th fibonacci
        int f[]=new int[n+1];
        System.out.println("by memoization :"+fib_memoization(n,f));
        System.out.println("by tabulation : "+fib_tabulation(n));
    }
}