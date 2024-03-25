import java.util.ArrayList;
public class PairSum{
    public static boolean findKey(ArrayList<Integer> list,int key )
    {
        int lp=0,rp=list.size()-1;
        while(lp!=rp)
        {
            int num=list.get(lp)+list.get(rp);
            if(num==key)
            return true;
            if(num<key)
            lp++;
            else
            rp--;
            
        }
        return false;
    }

    public static boolean pairsum(ArrayList<Integer> list,int tar)
    {    int pivot=0;
         for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            { pivot=i;//pivot is the greatest element's index
            break;}
        }
        int lp=pivot+1,rp=pivot;
        int n=list.size();
        while(lp!=rp)
        {   int num=list.get(lp)+list.get(rp);
            if(num==tar)
            return true;
            else if(num>tar)
            rp=(n+rp-1)%n;//when rp=0 the new value of rp would be n-1
            else
            lp=(lp+1)%n;//when lp=n-1 then the new val of rp would be 0
        }
        return false;
    }

    public static void main(String args[])
    {   
        ArrayList<Integer> list=new ArrayList<>();//sorted
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int key=5;
        // System.out.println(findKey(list,key));
        ArrayList<Integer> list2=new ArrayList<>();//sorted and rotated array
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target=106;
        System.out.println(pairsum(list2,target));
        
    }
}