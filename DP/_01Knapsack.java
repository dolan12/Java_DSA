public class _01Knapsack{
    public static int memoization(int val[],int wt[],int w,int n,int dp[][]){
        if(w==0||n==0)
        return 0;
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){//valid
            //include
            int ans1=val[n-1]+memoization(val,wt,w-wt[n-1],n-1,dp);

            //exclude
            int ans2=memoization(val,wt,w,n-1,dp);
            dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];
        }
        else{//only exclude
            dp[n][w]=memoization(val,wt,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static int knapsackTAbular(int val[],int wt[],int w){
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1];
                int wtt=wt[i-1];
                if(wtt<=j){
                    int incProfit=v+dp[i-1][j-wtt];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    int excProfit=dp[i-1][j];
                    dp[i][j]=excProfit;
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;//capacity
        int dp[][]=new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(memoization(val,wt,w,val.length,dp));
        // System.out.println(knapsackTAbular(val,wt,w));
    }
}