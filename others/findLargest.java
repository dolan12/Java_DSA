//find the largest number in an given array
// import java.util.*;
public class findLargest{
    public static int large(int arr[])
    {   int largenum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largenum)
            largenum=arr[i];
        }
        return largenum;
    }


public static void main(String args[])
{
    int arr[]={4,6,2,8,0};
    int ans=large(arr);
    System.out.println("THE LARGE NUMBER IS: " + ans);
    
}}