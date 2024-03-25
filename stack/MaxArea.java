import java.util.*;
public class MaxArea{
    public static int CalMaxArea(int[] arr)
    {
        
        //cal Next smaller right
        Stack<Integer> s=new Stack<>();
        int nsr[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=arr.length;
            }
            else
            nsr[i]=s.peek();
           
            s.push(i);
        }

        //cal Next smaller left
        s=new Stack<>();
        int nsl[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            nsl[i]=s.peek();
            
            s.push(i);
        }

        //cal area
        int MaxArea=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int width=nsr[i]-nsl[i]-1;
            int area=arr[i]*width;
            MaxArea=Math.max(area,MaxArea);
        }

        return MaxArea;
    }
    public static void main(String args[])
    {
        int height[]={10,5,7,9,2,1};
        System.out.println(CalMaxArea(height));
    }
}