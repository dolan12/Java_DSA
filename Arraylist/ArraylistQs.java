import java.util.*;
public class ArraylistQs{
    // An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
    public static boolean checkMonotonic(ArrayList<Integer> list)
    {
        if(list.get(0)<=list.get(1))
        {
            for(int i=1;i<list.size()-1;i++)
            {
                if(list.get(i)>list.get(i+1))
                return false;
            }
        }
        else{
         for(int i=1;i<list.size()-1;i++)
            {
                if(list.get(i)<list.get(i+1))
                return false;
            }
        }
        return true;
    }

// A number x is lonely when it appears only once, and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
            {
                list.add(nums.get(i));
            }
        }
            if (nums.size() == 1) {//if there are only one element then just add it
                list.add(nums.get(0));
            }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {//checking for first element
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {//checking for last element
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        // System.out.println(checkMonotonic(list));
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(6);
        list2.add(3);
        list2=findLonely(list);
        for(int i=0;i<list2.size();i++)
        {
        System.out.print(list.get(i)+" ");
        }
    } 
}