public class fac {
    public  static int fact(int n)
    {   int ans=1;
        if(n==1)
        return 1;
        else
        ans=n*fact(n-1);
        return ans;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.println(fact(n));
    }
}