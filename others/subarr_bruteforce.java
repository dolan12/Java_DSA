//program to print max subarray sum
//here we have used three loops so TC=O(3).
//for for more good algoritm try searching subarr_prifix and kadane

public class subarr_bruteforce{
    public static void subarr_sum(int arr[])

{        int maxsum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
        {   
            for(int j=i;j<arr.length;j++)
            { 
                int currsum=0;//currsum should always update after each subarray iteration
                for(int k=i;k<=j;k++)
                {
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(currsum > maxsum)
                    maxsum=currsum;
            }
        }
       System.out.println("the maximum subarray sum is: "+ maxsum);
}
public static void main(String args[])
{
    int arr[]={1,-2,6,-1,3};
    subarr_sum(arr);
}
}