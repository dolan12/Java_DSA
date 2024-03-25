public class pairsarr{
    public static void makepair(int arr[])
    {   System.out.println("the pairs are: ");
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("(" + arr[i] + ","+arr[j] + ")" );
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,7,8};
        makepair(arr);
    }
}