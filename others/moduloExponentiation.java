public class moduloExponentiation{
    public static int cal(int a,int b ,int c)
    {
        if(a==0)
        return 0;
        if(b==0)
        return 1;
        long y;
        if(b%2==0)//if b is even
        {
            y=cal(a,b/2,c);
            y=(y*y);
        }
        else //if b is odd
         {
            y=cal(a,b-1,c);
            y=a*y;
         }
         return (int)y%c;
    }
    public static void main(String args[])
    {
        int a=12,b=3,c=5;
        System.out.println(cal(a,b,c));
    }
}