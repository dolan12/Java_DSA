import java.util.*;
public class nearestCar{
    static class Point implements Comparable<Point>{
        int x,y,idx,distance;
            public Point(int x,int y,int distance,int idx){
            this.x=x;
            this.y=y;
            this.distance=distance;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distance-p2.distance;
        }
        
    }
    public static void main( String args[]){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;//get the first k cars
        PriorityQueue<Point> pq=new PriorityQueue<>();
       
        for(int i=0;i<pts.length;i++){
            int distance=(int)Math.sqrt(pts[i][0]*pts[i][0]-pts[i][1]*pts[i][1]);
            pq.add(new Point(pts[i][0],pts[i][1],distance,i));
        }
        for(int i=0;i<k;i++){
            System.out.print("c"+pq.remove().idx+" ");
        }
    }
}