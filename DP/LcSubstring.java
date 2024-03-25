public class LcSubstring{
    public static void main(String args[]){
        String str1="abcde",str2="abgce";
       System.out.println(longestCommonSubstring(str1,str2));
    }
    public static int longestCommonSubstring(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=0;

        //initialise or base case
            //though these are not necessary in java as 0 the default value
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<str1.length();i++){
            for(int j=1;j<str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1]+1;
                ans=Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j]=0;//as here we have to take the contigous elementws
                }
            }
        }
        return ans;
    }
}