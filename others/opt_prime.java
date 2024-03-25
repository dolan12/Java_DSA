import java.util.*;

    
public class opt_prime {
    public static boolean optt_prime(int n)
    {   if (n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        { 
            if (n%i==0)
            {
                return false;
            }
        }
     return true;}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println (optt_prime(n));
    }
    
}