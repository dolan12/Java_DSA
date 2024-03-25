public class mountainRanges{
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int in=dp[j];// combinations of pairs inside
                int out=dp[i-j-1];//combinations of pairs outside
                dp[i]+=in*out;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(tabulation(6));
    }
}