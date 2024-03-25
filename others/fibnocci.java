//print n'th fibonacci number
public class fibnocci{
    public static int getFib(int n){
        int fn1,fn2,fn;
        if(n==0||n==1)
        return n;
        else
         fn1=getFib(n-1);
         fn2=getFib(n-2);
         fn=fn1+fn2;
        return fn;
    }
    public static void main(String args[])
    {
        int n=7;
        System.out.println(getFib(n));
    }
}