//though worst case TC=O(n^2) But best case TC=O(n)..in normal bubble sort best case TC is also O(n^2)
public class modifiedBubble{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++)//turn
        {   boolean swapped= false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped ==false){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,7};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}