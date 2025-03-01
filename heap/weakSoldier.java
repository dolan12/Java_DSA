import java.util.*;
public class weakSoldier{
    static class row implements Comparable<row>{
        int soldier,idx;
        row(int soldier,int idx){
            this.soldier=soldier;
            this.idx=idx;
        }
        @Override
        public int compareTo(row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }
            else
            return this.soldier-r2.soldier;
        }
    }
    public static void main(String args[]){
        int army[][]={  {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                        };
        int k=2;
        PriorityQueue<row> pq=new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new row(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.print("R"+pq.remove().idx+" ");
        }
    }
}