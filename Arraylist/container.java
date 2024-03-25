//find the two walls which stores the max water
import java.util.*;
public class container {

    //TC=O(n^2)
    public static int bruteforce(ArrayList<Integer> height)
    {   
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int area=Math.min(height.get(i),height.get(j))*(j-i);
                if(area>maxArea)
                maxArea=area;
            }
        }
        return maxArea;
    }

    //Tc = O(n)
    //most optimized
    public static int findArea(ArrayList<Integer> height)
    {   int area=0,maxArea=Integer.MIN_VALUE;
        int ll=0,rl=height.size()-1;//leftline ,right line
        while(ll<rl)
        {
            area=(Math.min(height.get(ll),height.get(rl)))* (rl-ll);
            if(area>maxArea)
            maxArea=area;
            if(height.get(ll)<height.get(rl))
            ll++;
            else
            rl--;

        }
        return maxArea;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(findArea(height));
        // System.out.println(bruteforce(height));
    }
}