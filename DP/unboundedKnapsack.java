public class unboundedKnapsack{
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
                    int incProfit=v+dp[i][j-wtt];// only slight change in here
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
       System.out.println( knapsackTAbular(val,wt,w));
    }
}