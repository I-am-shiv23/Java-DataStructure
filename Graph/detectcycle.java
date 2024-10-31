package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class detectcycle {
  public static class Edge {
  int sour;
  int dest;
  //int weight;
  public Edge(int sour,int dest){
    this.sour = sour;
    this.dest = dest;
    //this.weight = weight;
  } 
  }
  public static void CreateAgraph(ArrayList<Edge>[] graph){
     
   for(int i = 0;i<graph.length;i++){
    graph[i] = new ArrayList<>();
   }    
  //  graph[0].add(new Edge(0, 1));
  //  graph[0].add(new Edge(0, 2));
  //  // 1
  //  graph[1].add(new Edge(1, 0));
  //  graph[1].add(new Edge(1, 3));

  //  // 2
  //  graph[2].add(new Edge(2, 0));
   

  //  // 3
  //  graph[3].add(new Edge(3, 1));

   // 4
 
  
   
  }


  // public static void BFS(ArrayList<Edge>[] graph){
  //   boolean vis[] = new boolean[graph.length];
  //   for(int i = 0;i<graph.length;i++){
  //       BFSutil(graph,vis,i);
  //   }
  // }
  // public static void BFSutil(ArrayList<Edge>[] graph,boolean vis[],int j){
  //   Queue<Integer> q = new LinkedList<>();
  //    q.add(j);
  //   while(!q.isEmpty()){
  //       int curr = q.remove();
  //       if(!vis[curr]){
  //           System.out.print(curr+" ");
  //           vis[curr] = true;
  //           for(int i = 0;i<graph[curr].size();i++){
  //               Edge e = graph[curr].get(i);
  //               q.add(e.dest);
  //           }
  //       }  
  //   }

  //  } 
//    public static void DFS(ArrayList<Edge>[] graph){
//     boolean vis[] = new boolean[graph.length];
//     for(int i = 0;i<graph.length;i++){
//         DFSutil(graph,vis,i);
//     }
//   }
// public static void DFSutil(ArrayList<Edge>[] graph,boolean vis[],int curr){
//    if(!vis[curr]){
//       System.out.print(curr+" ");
//       vis[curr] = true;
//       for(int i = 0;i<graph[curr].size();i++){
//         Edge e = graph[curr].get(i);
//         DFSutil(graph, vis, e.dest);
//       }
//    }
//    return;
// } 
public static boolean DetectCycle(ArrayList<Edge>[] graph){
  boolean[] vis = new boolean[graph.length];
  for(int i = 0;i<graph.length;i++){
    if(!vis[i]){
      if(DetectCycleUtil(graph,vis, i,-1)){
        return true;
      }
    }
  }
  return false;
}
public static boolean DetectCycleUtil(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){
 
 vis[curr] = true;

 for(int i = 0;i<graph[curr].size();i++){
  Edge e = graph[curr].get(i);
  if(!vis[e.dest]){
    if(DetectCycleUtil(graph,vis,e.dest,curr)){
      return true;
    }else if(vis[e.dest] && e.dest != par){
      return true;
    }
  }
 }
 return false;
}
public static void main(String[] args) {
   
        /*         1----3
                  /     
                 0     
                  \    
                   2----4
         *                 
         * 
         */
 int v = 4;
 ArrayList<Edge>[] graph = new ArrayList[v];
 CreateAgraph(graph);
//  BFS(graph);
//  System.out.println(); 
//  DFS(graph);
System.out.println(DetectCycle(graph));
}
    
}
