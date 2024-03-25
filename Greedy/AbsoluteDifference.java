//given two arrays A and B of equal length n. pair each element of
// array A to an element in array B,such that sum S of absolute differences of all the pairs is minimum
import java.util.*;

public class AbsoluteDifference{
    public static void main(String args[])
    {
        int arr1[]={4,1,8,7};
        int arr2[]={2,3,6,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int abs=0;
        for(int i=0 ;i<arr1.length;i++)
        {
            abs+=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("Min absolute value: "+ abs);
        
    }
}