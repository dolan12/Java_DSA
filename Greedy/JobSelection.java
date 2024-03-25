import java.util.*;
public class JobSelection
{  static class Job{
    public int deadline,profit,id;
        Job(int iD,int d,int p)
        {
            deadline=d;
            profit=p;
            this.id=iD;
        }
    }
    public static void main(String args[])
    {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++)
        {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);//descending sort of objects
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++)
        {
            Job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("maximum job possible to make maximum profit : "+seq.size());
        System.out.println("the jobs id are :");
        for(int i=0;i<seq.size();i++)
        {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    
}