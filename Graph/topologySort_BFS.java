import java.util.*;
public class topologySort_BFS{
    static class Edge{
        int src,dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void indegree(ArrayList<Edge>[] graph,int indeg[]){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void TopologySort(ArrayList<Edge>[] graph){
        int indeg[]=new int[graph.length];
        indegree(graph,indeg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){//get the all starting point
            if(indeg[i]==0)
            q.add(i);
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0)
                q.add(e.dest);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        ArrayList<Edge>[] graph=new ArrayList[6];//size =6
        createGraph(graph);
        TopologySort(graph);
    }
    
}