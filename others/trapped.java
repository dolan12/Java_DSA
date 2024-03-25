//program of trappped rainwater problem
public class trapped {
    public static int trapped_water(int h[])
    {   int n=h.length;
        int waterlevel,trap_water=0;
        //cal. lefmax boundry
        int leftmax[]=new int [n];
        leftmax[0]=h[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],h[i]);
        }
        //cal rightmax boundry
        int rightmax[]=new int [n];
        rightmax[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],h[i]);
        }
        for(int i=0;i<n;i++)
        {
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            trap_water+=(waterlevel-h[i]);
        }
        return trap_water;
    }
    public static void main(String args[])
    {
        int arr[]={4,2,0,6,3,2,5};
        int area= trapped_water(arr);
        System.out.println("area of total trapped water is :"+ area);
    }
}