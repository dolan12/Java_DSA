import java.util.*;
public class graphBasic{
    static class Edge{
        int sc,dest,wt;// source,destination, wt
        Edge(int sc,int dest,int wt){
            this.sc=sc;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String args[]){
        int v=5;//no of vertices
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];//an array of arraylist<Edge>
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();//assigning a empty arraylist to every position
        }

    }
}