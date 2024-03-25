public class ith_bit{
    public static void get_ith_bit(int n,int i)
    {
        int bitmask=( 1<<i);
        if((n&bitmask)==0)
        {System.out.println("the "+i+" th bit is zero");}
        else
        System.out.println("the "+i+" th bit is one");

    }
    public static int  set_ith_bit(int n,int i)
    {
        int bitmask=(1<<i);
        return (n|bitmask);

    }
    public static int clear_ith_bit(int n,int i)
    {
         int bitmask=~(1<<i);
         return (n& bitmask);
    }
    public static int  update_ith_bit (int n,int i,int newbit)
    {
        // if(newbit==0)//brute force
        // {
        //     return clear_ith_bit(n,i);
        // }
        // else
        //     return set_ith_bit(n,i);

         n=clear_ith_bit(n,i);
        int bitmask=newbit<<i;
        return n| bitmask;

    }
    public static int clear_last_bits(int n,int i)
    {
        int bitmask= ~0<<i;
        return n&bitmask;

    }
    public static int clear_range_bits(int n,int i,int j)
    {
        int a=(~0)<<(j+1),b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    //check if a number is a power of 2 or not
    public static void power_of_2(int n)
    {
        if((n&(n-1))==0)
        System.out.println(n+ " is a power of 2");
        else
              System.out.println(n+ " is not a power of 2");
    }
    //count set bits in number
    public static void countSetBits(int n)
    {   int count =0;
        int num=n;
        while(n!=0)
        {
            int bitmask=1;
            if((n&bitmask)!=0)
            count++;
            n=(n>>1);
        }
        System.out.println("the no of bits in "+num +" is "+ count);
    }
    public static int fastExpo(int a ,int n)
    {
        int ans=1;
         while(n>0)
         {
            if((n&1)==1)
            {
                ans=ans*a;
            }
            a*=a;
            n=n>>1;
         }
         return ans;
    }
    public static void main(String args[])
    {
        get_ith_bit(10,3);
        System.out.println(set_ith_bit(10,2));
        System.out.println(clear_ith_bit(10,3));
        System.out.println(update_ith_bit(10,0,1));
        System.out.println(update_ith_bit(10,1,0));
        System.out.println(clear_last_bits(15,2));
        System.out.println(clear_range_bits(15,2,4));
        power_of_2(16);
        power_of_2(13);
        countSetBits(14);
        System.out.println(fastExpo(5,3));
    }
}