public class subarr{
    public static void subarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {   
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7,8};
        subarray(arr);
    }
}