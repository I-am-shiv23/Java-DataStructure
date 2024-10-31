package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.CreateAgraph.Edge;

// connected components functions both of bfs and dfs         
public class connecdtedgraph {
    public static void DFS(ArrayList<Edge>[] graph){
    boolean vis[] = new boolean[graph.length];

    for(int i  = 0;i<graph.length;i++){
      if(!vis[i]){
        DFSutil(graph, i, vis);
      }
    }

    
    }
    public static void DFSutil(ArrayList<Edge>[] graph,int curr, boolean vis[]){
        //visit
        System.out.println(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.d]){
                 DFSutil(graph,e.d,vis);
            }
        }
    }
    public static void BFS(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
             for(int i = 0;i<graph.length;i++){
                if(!vis[i]){
                BFSutil(graph, vis);
                }
             }
    }
    public static void BFSutil(ArrayList<Edge>[] graph, boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);         
      while(!q.isEmpty()){
        int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
               
                for(int j = 0;j<graph[curr].size();j++){
                    Edge e = graph[curr].get(j);
                    q.add(e.d);
                }
            }
      }
    }

       
    public static void main(String[] args) {
             
         

    }
    
}
