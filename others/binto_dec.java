import java.util.*;
public class binto_dec {
    public static int bin_dec(int a)
{   int power=0,dec=0;
    while(a!=0)
    {
       int  lastdigit=a%10;
        dec=(int)(dec+ (lastdigit*(Math.pow(2,power))));// double Math.pow(double,double) needs typecasting
       a/=10;
       power++;
    }
    return dec;
}
    public static void main(String args[])
{
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int dec=bin_dec(n);
    System.out.println(dec);
}
}