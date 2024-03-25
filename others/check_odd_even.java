public class check_odd_even{
    public static void check(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("odd");
        }
        else
        System.out.println("even");
    }
    public static void main(String args[])
    {
        check(13);
        check(2);
        check(7);
        check(30);
        
    }
}