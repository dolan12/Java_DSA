import java.util.*;
public class Sum0{
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                maxLength=Math.max(maxLength,i-map.get(sum));//j-i
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println("0 sum subarray : "+maxLength);

        //count subarray sum equal to k
        int arr2[]={10,2,-2,-20,10};
        int k=-10;
        map.clear();
        map.put(0,1);
        int ans=0;
        sum=0;
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }

        }
        System.out.println("k sum subarray :"+ans);
    }
}