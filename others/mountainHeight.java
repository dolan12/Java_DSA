import java.util.*;
public class mountainHeight
{   public static int calExplosion(int a[],int b[])
    {   int explosion=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]-=b[i];
        }
        for(int i=0;i<a.length-1;i++)
        {   int curr=Math.min(a[i],a[i+1]);
            explosion+=curr;
            a[i]-=curr;
            a[i+1]-=curr;
            if(a[i]!=0)
            return -1;//if not possible
        }
        if(a[a.length-1]!=0)
        return -1;
        return explosion;
    }
    public static void main(String args[])
    {   
        int a[]={5,6,7,8,9};//height of mountain 1
        int b[]={4,3,2,1,5};//we have to make a like this
        int explosion=calExplosion(a,b);
        if(explosion==-1)
        System.out.println("not possible");
        else
        System.out.println("explosives needed is :"+explosion);
    }
}