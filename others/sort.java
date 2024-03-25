public class sort{
    public static void bubblesort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
         }}
        }
       
    }
    public static void selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {   int min=i;
            for(int j=i+1;j<arr.length;j++)
            {if(arr[min]>arr[j])
              min=j;}
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];arr[i]=temp;
            }
        }
    }
    public static void insertionsort(int arr[])
    {   
        for(int i=1;i<arr.length;i++)
        {int j=i-1;int temp=arr[i];
            while(j>=0&& arr[j]<temp)//arr[j]<arr[i] is false because the value in arr[i] has been changed 
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void countingsort (int arr[])
    {
        int largest=Integer.MIN_VALUE;
        //find range
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest+1];//create count array
        //update the count array
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        //sorting 
        int j=0;
        for(int i=0;i<count.length;i++)
        {  
            while(count[i]>0)
            {
                arr[j]=i;
                j++;count[i]--;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,4,16,2,1};
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        countingsort(arr);
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }

}