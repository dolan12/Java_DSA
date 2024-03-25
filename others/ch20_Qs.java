public class ch20_Qs{
    
    public static void printArr(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(String arr[],int si,int ei)
    {
        if(si>=ei)
        return;
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei)
    {
        String temp[]=new String [ei-si+1];
        int i=si;int j=mid+1;int k=0;
        while(i<=mid&&j<=ei)
        {
            if((arr[i].compareTo( arr[j]))<0)
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for( i=si,k=0;i<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }

    public static int majorElem(int arr[])
    {   int size=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>size)
            size=arr[i];
        }
        int temp[]=new int [size+1];
        for(int i=0;i<arr.length;i++){
            temp[(arr[i])]++;
        }
        size=Integer.MIN_VALUE;
        int val=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>size){
                size=temp[i];
                val=i;
            }
            
        }
        return val;
    }

    public static int merge(int arr[],int si,int mid ,int ei){
        int invcount=0;
        int i=si,j=mid,k=0;
        int temp[]=new int [ei-si+1];
        while(i<mid&&j<=ei)
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
                {temp[k]=arr[j];
                j++;
                invcount+=(mid-i);}
                k++;
        }
        while(i<mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        for(i=si,k=0;i<=ei;i++,k++){
            arr[i]=temp[k]; 
        }
        return invcount;

    }
    public static int invsCount(int arr[],int si,int ei){//mergesort
        int invcount=0;
        if(si<ei)
        {
        int mid=si+(ei-si)/2;
         invcount =invsCount(arr,si,mid);//left
        invcount+=invsCount(arr,mid+1,ei);//right
        invcount+=merge(arr,si ,mid,ei);
        }
        return invcount;
    }
    
    public static void main(String args[])
    {   
        // 1 
        // String arr[]={"sun","earth","mars","mercury"};
        // mergesort(arr,0,arr.length-1);
        // printArr(arr);
        // 2
        // int arr[]={2,2,1,1,1,2,2,3};
        // System.out.println(majorElem(arr));
        
        // 3
        int arr[]={2,4,1,3,5};
       ;//inverse count 
        System.out.println("inverse count is:  "+invsCount(arr,0,arr.length-1));
    }
}