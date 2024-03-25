import java.util.*;
public class practice{
    public static void mergesort(int arr[],int si,int ei)
    {
        if(si>=ei)
        return;
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge( arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid ,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;int j=mid+1;
        int k=0;
        while(i<=mid &&j<=ei)
        {
            if(arr[i]>arr[j])
                {temp[k]=arr[j];
                j++;}
            else
            {temp[k]=arr[i];
            i++;}
            k++;
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;i++;
        }
        while(j<=ei)
        {
            temp[k]=arr[j];
            j++;k++;
        }
        for( k=0,i=si;k<temp.length;i++,k++)
        {
            arr[i]=temp[k];
        }
    }

    public static int tiling(int n)
    {
        if(n==0||n==1)
        return 1;


        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main (String args[])
    {   Scanner sc=new Scanner(System.in);
        // String str="helloworld".replace("llo","hgf");
        // System.out.println(str);

        // int arr[]={6,3,9,5,2,8};
        // mergesort(arr,0,arr.length-1);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // int n=50,k=5;
        //  for(int i=0;i<n;i+=k){
        //     for(int j=i+1;j<=k;j++){
        //         System.out.println(i+" "+j);
        //     }
        //  }

        //tile
        // System.out.println("total ways: "+ tiling(5));
        

    }
}