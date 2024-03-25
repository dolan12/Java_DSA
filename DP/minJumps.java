import java.util.Arrays;
public class minJumps{
    public static int dpTab(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;//in destination

        for(int i=n-2;i>=0;i--){
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                if(dp[j]!=-1){//for no jump allow block
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];
    }
    public static void main(String args[]){
        int arr[]={2,3,1,1,4};
        System.out.println(dpTab(arr));
    }
}