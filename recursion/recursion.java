public class recursion{
    public static boolean isSorted(int arr[],int i)
    {
        if(i==arr.length-1)
        return true;
        if(arr[i]>arr[i+1])
        return false;
        else 
        
        return isSorted(arr, i+1);
    }

    public static int firstOccourence(int arr[],int key,int i)
    {
        if(i==arr.length)
        return -1;
        if(key==arr[i])
        return i;
       return firstOccourence(arr,key,i+1);
    }

    public static int lastOccourence(int arr[],int key,int i)
    {
        if(i==arr.length)
        return -1;
        int isfound= lastOccourence(arr,key,i+1);//first forward looking
        if(isfound==-1&&arr[i]==key)//backtracking and comaparing.here isfound==-1 condition remains to check if no other index have been updated yet
        return i;

       return isfound;
    }

    public static int pow_(int x,int n)
    {
        if(n==1)
        return x;
        int ans=x*pow_(x,n-1);
        return ans;
    }

    public static int powerOptimized(int x,int n){
        if(n==1)
        return x;
        int halfPower=powerOptimized(x,n/2);
        int halfPowerSq=halfPower*halfPower;
        //if n is odd
        if((n%2)!=0)
        {
            halfPowerSq= x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[])
    {
        int arr[]={2,6,5,10};           
        // System.out.println(isSorted(arr,0));
        int arr2[]={4,3,7,9,1,3,5,9,1,7,10};
        int key=1;
        // System.out.println(firstOccourence(arr2,key,0));
        // System.out.println(lastOccourence(arr2,key,0));
        int x=5;int n=10;
        System.out.println(pow_(x,n));//O(n)
        System.out.println(powerOptimized(x,n));//O(log n)
        
    }
}