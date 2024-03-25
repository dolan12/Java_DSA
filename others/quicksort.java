public class quicksort{
    public static void quicksort(int arr[],int si,int ei)
    {  if(ei<=si)
        return;
         int pivotIndex=partition(arr,si,ei);//main work
        quicksort(arr,si,pivotIndex-1);//left
        quicksort(arr,pivotIndex+1,ei);//right
    
        
    }
   public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;//to make place for swapping 
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {i++;
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;}
        }
        //make place the pivot
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[])
    {
        int arr[]={6,3,8,9,5,-2};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}