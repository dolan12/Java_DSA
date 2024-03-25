import java.util.*;
public class greedyQs{
    public static void findSubString(String str)
    {
        int l=0,r=0;
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='L')
            l++;
            else if(str.charAt(i)=='R')
            r++;
            if(r==l)
            ans++;
        }
        System.out.println("maximum balanced string partition : "+ans);
    }

    public static int findLargeOdd(int l,int r,int k)
    {
        if(r%2==0)
        r--;
        int oddNum=r-(2*(k-1));//as r is the 1'st odd large num
        if(oddNum<l)
        return 0;
        return oddNum;
    }
    public static char[] findSmallestString(int n,int k)
    {
        char arr[]=new char[n];
        Arrays.fill(arr,'a');//to make this string lexigraphically small
        for(int i=n-1;i>=0;i--)
        {
            k-=i;
            if(k>=0)
            {
                if(k>=26)
                {
                    arr[i]='z';
                    k-=26;
                }
                else{
                    arr[i]=(char) (k+97-1);//
                    k-=arr[i]-'a'+1;
                }

            }
            else
                break;
            k+=i;
        }
        return arr;
    }

    public static int findMaxProfit(int price[])
    {
        int buy=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++)
        {
            if(buy>price[i])
            buy=price[i];
            else
            {int profit=price[i]-buy;
            maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static int ans=10000000;
    public static void solve(int a[],int k,int index,int sum,int maxSum)
    {
        if(k==1){
            maxSum=Math.max(maxSum,sum);
            sum=0;
            for(int i=index;i<a.length;i++){
                sum+=a[i];
            }
            maxSum=Math.max(maxSum,sum);
            ans=Math.min(ans,maxSum);//minimum possible subarray sum
            return;
        }
        sum=0;
        for(int i=index;i<a.length;i++)
        {
            sum+=a[i];
            maxSum=Math.min(maxSum,sum);
            solve(a,k-1,i+1,sum,maxSum);
        }
    }
    public static void main(String args[])
    {   
        // 1
        //     //maximum balanced string partition
        // String str="RLLRLRLRLRRR";
        // findSubString(str);

        //2
            //find k'th largest odd numbers
        // int l=-3,r=3,k=3;
        // System.out.println(k+"'th largest odd number is : "+findLargeOdd(l,r,k));

        //3 
        //lexographically smallest string of length N and sum K
        // int n=2,k=42;
        // char arr[]=findSmallestString(n,k);
        // System.out.println(new String(arr));//convert the array to string

        //4
        // best time to buy and sell stocks
        // int price[]={7,6,4,3,1};
        // System.out.println( findMaxProfit(price));

        //5 
        //split the given array into K sub-array
        int arr[]={1,2,3,4};
        int k=3;//k division
        solve(arr,k,0,0,0);
        System.out.println(ans);
    }
}