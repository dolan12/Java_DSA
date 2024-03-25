//given n friends ,each one can remain single or can be paired up with 
//some other friend.each can be paired only once.find out the total ways in which friends
// can remain single or can be paired up.
public class friendsPairing{
    public static int calWays(int n)
{
    if(n==1||n==2)
    return n;

    //choice 
    //single
    int fnm1=calWays(n-1);
    //paired
    int fnm2=calWays(n-2);
    //in pair decision there is (n-1) choices and the next choice is f(n-2); as two have paired
    int pairWays=(n-1)*fnm2;//those who have paired can have multiple combination for each willing to pair ,have n-1 options

    //totalways
    int totways=fnm1+pairWays;
    return totways;
}
public static void main(String args[])
{
    int friends=7;
    System.out.println(calWays(friends));
}
}