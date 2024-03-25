//unknown error at 15
import java.util.*;

public class ActivitySelection{
    public static void ActivitySelect(int start[],int end[])
    {
        //sort from end time basis
        int activities[][]=new int [start.length][3];;
        for(int i=0;i<start.length;i++)//traverse row wise
        {
            activities[i][0]=i;//index
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort ( activities,Comparator.comparingDouble(o -> o[2]));
        
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        int count=1;
        for(int i=1;i<activities.length;i++)
        {
            if(activities[i][1]>=lastEnd)
            {
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
                count++;
            }
        }
        System.out.println("total maximum activity : " + count);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A"+ans.get(i));
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ActivitySelect(start,end);

    }
}