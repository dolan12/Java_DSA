import java.util.*;
public class binarysearch{
    public static int binsearch(int arr[],int key)
    {   int start=0,end=arr.length-1;
    int mid;
        while(start<=end)
        {
            mid =(start+end)/2;
            if (key==arr[mid])
                return mid;
            else if(key<=arr[mid])
                end =mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,9,10};
        int key=sc.nextInt();
        int index=binsearch(arr,key);
        System.out.println("the item is in index: "+ index);
    }
}