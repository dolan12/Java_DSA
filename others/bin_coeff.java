import java.util.*;
public class bin_coeff{
    // public static int bin_coeff(int ,int );
    // public static int fact (int);


    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int r=sc.nextInt();
       int coeff=bi_coeff(n,r);
       System.out.println("the binomail coefficient of "+ n +" and "+ r +" is "+ coeff);
    }
   public static int  bi_coeff( int n,int r)
   {
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bico=fact_n/(fact_r*fact_nmr);
        return bico;
   }
   public static int fact(int a)
   { int fc=1;
    for(int i=1;i<=a;i++)
    {
           fc=fc*i;
    }
    return fc;
   }
}