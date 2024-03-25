import java.util.*;
public class palindrome {
    public static boolean palindrom(int a)
    {   int reverse=0;
        int temp=a;
        while(a>0)
        {
            int lastdigit=a%10;
            reverse=(reverse*10+lastdigit);
            a/=10;
        }
        if(temp==reverse)
            return true ;
        else 
            return false;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(palindrom(num));
    }
}