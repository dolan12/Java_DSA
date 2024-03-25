public class leader{
    public static void mkLeader(int arr[])
    {
        int leader=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>leader)
            {
                leader=arr[i];
                System.out.print(leader+" ");
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={15,5,14,4,9,6};
        mkLeader(arr);
    }
}