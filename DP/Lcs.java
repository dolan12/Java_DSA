//longest common subsequence
public class Lcs{

    //recursion
    public static int longestCs(String str1,int n,String str2,int m){
        if(n==0||m==0)
        return 0;
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return longestCs(str1,n-1,str2,m-1)+1;
        }
        else{
            int in=longestCs(str1,n-1,str2,m);
            int out=longestCs(str1,n,str2,m-1);
            return Math.max(in,out);
        }
    }
    //DP
    public static int dpSoln(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        //base case initialisation not necessary here 
        for( int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){//same char
                    dp[i][j]=dp[i-1][j-1]+1;//+1 for the same sequence count
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    //count the total operation to convert str1 to str2
    public static int editDistance(String str1,String str2){
       int n=str1.length();
       int m=str2.length();
       int dp[][]=new int[n+1][m+1];
       for(int i=0;i<n+1;i++){
        for(int j=0;j<m+1;j++){
            if(i==0)
                dp[i][j]=j;
            if(j==0){
                dp[i][j]=i;
            }
        }
       }

       for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1];
            }
            else{
                int add=dp[i][j-1]+1;
                int del=dp[i-1][j]+1;
                int  rep=dp[i-1][j-1]+1;
                dp[i][j]=Math.min(add,Math.min(del,rep));
            }
        }
       }
       return dp[n][m];
    }
    public static void main(String args[]){
        String str1="abcde";
        String str2="ace";
        System.out.println(longestCs(str1,str1.length(),str2,str2.length()));
        System.out.println("Using Dp:  "+dpSoln(str1,str2));
        //convert String 1 to String 2
        String word1="intention";
        String word2="execution";
        System.out.println(editDistance(word1,word2));

    }
}