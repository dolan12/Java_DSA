//program to reverse an array in 0(1) space complexty
import java.lang.*;
public class reversearr{
   
    public static void revarr(int arr[])
    {
        int start=0,end =arr.length-1;
        while(start<end)//dont use (start!=end)
        {
           int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
            start++;end--;
        }
    }  
    public static void main(String args[])
    {
        int arr[]={ 3,4,5,6,7,10};
        revarr(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i]+" ");
        }
        System.out.println("");

    }
}