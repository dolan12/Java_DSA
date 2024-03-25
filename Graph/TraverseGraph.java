import java.util.*;
public class TraverseGraph{
    static class Edge{
        int sc,dest,wt;
        Edge(int sc,int dest,int wt){
            this.sc=sc;
            this.dest=dest;
            this.wt=wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph,boolean vis[],int curr){
        System.out.print(curr+" ");
            vis[curr]=true;
            
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                   dfs(graph,vis,e.dest); 
                }
                
            }
        
    }

    public static boolean hasPath(ArrayList<Edge>[] graph,int sc,int dest,boolean vis[]){//here dest is ultimate destination
        if(sc==dest)
        return true;
        vis[sc]=true;
        for(int i=0;i<graph[sc].size();i++){
            
            Edge e=graph[sc].get(i);
            if(!vis[e.dest]&& hasPath(graph,e.dest,dest,vis))
            return true;
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];
        System.out.println("BFS traversal :");
        createGraph(graph);
        bfs(graph);
        System.out.println();
        System.out.println("DFS traversal :");
        //dfs
        boolean vis[]=new boolean[v];
        dfs(graph,vis,0);//0 as the starting point
        System.out.println();
        
        //has path
        System.out.println(hasPath(graph,0,5,new boolean[v]));
    }
}