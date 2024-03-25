//given awild card pattern, implement wildcard pattern matching algorithm that finds if wildcard pattern is matched with text.the matching should cover the entire text (not partial text).the wildcard pattern can include the characters ? and *
// '?' -matches any single character
// '*' -matches any sequence of characters( including the empty sequence)   
//  Ex: text="baaabab" pattern="*****ba****ab" ; output =true;
//  Ex: text="baaabab" pattern="a*ab" ; output =false;
public class wildcardMatching{
    public static boolean tabulation(String str,String pattern){
        int n=str.length(),m=pattern.length();
        boolean dp[][] =new boolean[n+1][m+1];
        //initialization
        dp[0][0]=true;
        for(int i=1;i<n+1;i++){//if pattern is empty(though it is not necessary for java)
            dp[i][0]=false;
        }
        for(int i=1;i<m+1;i++){//if string is empty
            if(pattern.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-1];
            }
            else{//for ? or any other character(except *)
                dp[0][i]=false;
            }
        }
        //bottom up calculation
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str.charAt(i-1)==pattern.charAt(j-1)||pattern.charAt(j-1)=='?'){//same char|| for ? it can produce any char
                    dp[i][j]=dp[i-1][j-1];
                }else if(pattern.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];//* as empty char||* when placed some char,but keep the * as it can produce multiple char
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String str="abbaab";
        String pattern="**ab?*ab";
        System.out.println(tabulation(str,pattern));
    }
}