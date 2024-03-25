public class mergeSort{
   
    public static void mergesort(int arr[],int si,int ei)
   {if(si>=ei)//when there is only one element left undivided
     return;
    int mid =si+(ei-si)/2;
    //divide part
    mergesort(arr,si,mid);//left part
    mergesort(arr,mid+1,ei);//right part
    //conquer part
    merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid ,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr

        while(i<=mid &&j<=ei)
        {
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
       //left part remaning elements 
       while (i<=mid){
       temp[k++]=arr[i++];//temp[k]=arr[i] then k++,i++
      }
      //right part remaning elements
      while (j<=ei){
       temp[k++]=arr[j++];
      }

      //copy temp to original arr
      for(k=0,i=si;k<temp.length;k++,i++)
      {
        arr[i]=temp[k];
      } 
    }

    public static void  main(String args[])
    {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
