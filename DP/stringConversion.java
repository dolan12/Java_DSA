public class stringConversion{
    public static int dpTAbulation(String str1,String str2){
        int n=str1.length(),m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<m+1;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int ans1=dp[i][j-1]+1;//addition
                    int ans2=dp[i-1][j]+1;//deletion
                    dp[i][j]=Math.min(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    //another approach 
    public static int soln2(String str1,String str2){
        int n=str1.length(),m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int delOp=str1.length()-dp[n][m];//deletion operation
        int addOp=str2.length()-dp[n][m];//addition operation
        return delOp+addOp;//as only addition ad deletion is possible here,replace is not possible
    }
    public static void main(String args[]){
        String str1="pear";
        String str2="sea";
        System.out.println(dpTAbulation(str1,str2));
        System.out.println(soln2(str1,str2));

    }
}