import java.util.*;
public class Chocola{
    public static void main(String args[])
    {
        Integer hor[]={4,2,1};
        Integer ver[]={4,3,2,1,1};
        //as we have to sort the array in descending order.we have to take integer class array to use jcf
        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());
        int h=0,v=0;
        int cost=0;
        int hp=1,vp=1;// horizontal part and vertical part
        while(h<hor.length&&v<ver.length)
        {
            if(hor[h]>=ver[v])
            {
                cost+=(hor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost+=(ver[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<hor.length)
        {
            cost+=(hor[h]*vp);
            hp++;
            h++;
        }
        while(v<ver.length)
        {
            cost+=(ver[v]*hp);
            vp++;
            v++;
        }

    System.out.println("min cost is : "+ cost);
    }

}