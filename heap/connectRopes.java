import java.util.*;
public class connectRopes{
    public static int countCost(int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        While(pq.size()>1){
            int n1=pq.remove();
            int n2=pq.remove();
            cost+=n1+n2;
            pq.add(n1+n2);
        }
        return cost;
    }
    public static void main(String args[])
    {   int  arr[]={4,3,2,6};
       System.out.println(countCost(arr));
    }
}