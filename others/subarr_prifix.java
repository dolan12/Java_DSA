public class subarr_prifix{
    public static void subarr_sum(int arr[])
{   int currsum;   
     int prifix[]=new int [arr.length];//make a new array of the same size as arr
        prifix[0]=arr[0];
        for(int i=1;i<prifix.length;i++)
        {
            prifix[i]=prifix[i-1]+arr[i];
        }

        int maxsum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
        {   
            for(int j=i;j<arr.length;j++)
            { 
                currsum= i==0?prifix[j]:prifix[j]-prifix[i-1];
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