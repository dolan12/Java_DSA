import java.util.Arrays;
public class mcm{
    public static int recursion(int arr[],int i,int j){
        if(i==j)//when there is only one matrix
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=recursion(arr,i,k);
            int cost2=recursion(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);
        }
        return ans;
    }
    public static int memoisation(int arr[],int dp[][],int i,int j){
        if(i==j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=recursion(arr,i,k);
            int cost2=recursion(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);
        }
        return dp[i][j]=ans;
    }
    public static int tabulation(int arr[]){
        int n=arr.length;
        int dp[][]=new int[n][n];

        //initialization
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        //bottom-up
        for(int len=2;len<n;len++){
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;//col
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dp[i][k];//cost from i to k
                    int cost2=dp[k+1][j];//cost from k+1 to j
                    int cost3=arr[i-1]*arr[k]*arr[j];//cost of multiplication of the calculated two matrix 
                    dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        System.out.println(recursion(arr,1,arr.length-1));
        
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memoisation(arr,dp,1,arr.length-1));

        System.out.println(tabulation(arr));

    }
}