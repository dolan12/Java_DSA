//L1=1,2,3,4,5
//L2=2,4,6,8,12
// L3=3,6,9,12,15
import java.util.ArrayList;
public class arraylist{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        ArrayList <Integer> list3=new ArrayList<>();
        for(int i=1;i<6;i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        for(int i=0;i<mainlist.size();i++)
        {
            System.out.println(mainlist.get(i));
        }
        System.out.println();
    }
}