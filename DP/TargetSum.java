public class TargetSum{
    public static boolean memoize(int arr[],int n,int tar,boolean dp[][]){
        if(n==0)
        return true;
        if(tar==0)
        return false;
        if(dp[n][tar]==true)
        return dp[n][tar];
        if(arr[n-1]<=tar&& memoize(arr,n-1,tar-arr[n-1],dp)==true){
            dp[n][tar]=true;
            return true;
            
        }
        else if(memoize(arr,n-1,tar,dp)){
            dp[n][tar]=true;
        }
        return dp[n][tar];
        
    }
    public static boolean tabulation(int arr[],int tar){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][tar+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=tar;j++){
                int v=arr[i-1];
                if(v<=j && dp[i-1][j-v]==true)
                return true;
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }

        }
        return dp[n][tar];
    }
    public static void main(String args[]){
        int val[]={3,5,2,9,1};
        int tar=100;
        boolean dp[][]=new boolean[val.length+1][tar+1];
        
        System.out.println(memoize(val,val.length,tar,dp));//unknown error
        // System.out.println(tabulation(val,tar));
        

    }
    
}