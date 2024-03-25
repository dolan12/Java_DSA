public class kadane{
    public static void kadanes(int a[])
    {   int sign =1;int currsum=0,maxsum=Integer.MIN_VALUE;
    //this is a hw if all elements are negative
    for(int i=0;i<a.length;i++)//check if negative or not 
    {
        if(a[i]>0)//if their is any positive element
        sign=-1;
    }
    if (sign==1)
    for(int i=0;i<a.length;i++)//if all numbers are negative then max subarray sum will be the max element 
    {
        if(maxsum<a[i])
        maxsum=a[i];
    }
        else{//kadanes actual code
        for (int i=0;i<a.length;i++)
        {
            currsum+=a[i];
            if(currsum<0)
            currsum=0;
            maxsum=Math.max(currsum,maxsum);
        }}
        
        System.out.println("max subarray sum is :"+ maxsum);
    }
    public static void main(String args[])
    {
        int arr[]={-2,-4,-6,-9,-1};//test here
        kadanes(arr);
    }
}