import java.util.*;
public class dectobin{
    public static int dec_bin(int a)
    { int power=0,bin=0; 
        while(a>0)
        {
            int lastdigit=a%2;
            bin=bin+(int)(lastdigit*Math.pow(10,power));
            power++;a/=2;
        }
        return bin;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int bin=dec_bin(n);
        System.out.println(bin);
    }
}