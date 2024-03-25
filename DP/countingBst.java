//find the no of all possible Bst's with given n nodes
public class countingBst{
    //it will exactly like catalan number code
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int left=dp[j];//combinations of left subtree
                int right=dp[i-j-1];//combinations of right subtree
                dp[i]+=left*right;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(tabulation(n));
    }
}