public class ser_rotateArr{
    public static int ser(int arr[],int si,int ei,int tar)
    {
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar)
        return mid;

        if(si>=ei)
        return -1;
        //if mid on L1
        if(arr[si]<=arr[mid]){
             if(tar>=arr[si]&& tar<arr[mid])
             {
                return ser(arr,si,mid-1,tar);
             }
             else
             return ser(arr,mid+1,ei,tar);
        }
        //if mid on L2
        else{
            if(arr[mid]<=tar&&tar<=arr[ei])
            {
                return ser(arr,mid+1,ei,tar);
            }
            else{
                return ser(arr,si,mid-1,tar);
            }
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(ser(arr,0,arr.length-1,2));
    }
}