public class heapSort{
    public static void heapify(int arr[],int i ,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(left<size && arr[left]>arr[maxIdx])
        maxIdx=left;
        if(right<size && arr[right]> arr[maxIdx])
        maxIdx=right;

        if(maxIdx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr, maxIdx,size);
        }
    }
    public static void heapSort(int arr[]){
        // build maxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // push largest at end
        for(int i=n-1;i>0;i--){
            // swap largest-first with last
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
            
        }
    }

    public static void heapify2(int arr[],int i,int size){
        //minheap
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;

        if(left<size &&arr[left]<arr[minIdx])
        minIdx=left;

        if(right<size && arr[right]<arr[minIdx])
        minIdx=right;
        if(minIdx!=i){
            //swap
            int temp=arr[0];
            arr[0]=arr[minIdx];
            arr[minIdx]=temp;
            heapify2(arr,minIdx,size);
        }
    }
    public static void heapSort2(int arr[]){
        // minheap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify2(arr,i,n);
        }

        for(int i=n-1;i>0;i--){
            //swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify2(arr,0,i);
        }
    }
    public static void main(String args[]){
        //ascending order
        // int arr[]={1,2,4,5,3};
        // heapSort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //descending order
        int arr2[]={5,4,1,3,2};
        heapSort2(arr2);
         for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}