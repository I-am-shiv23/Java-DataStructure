package Graph;

import java.util.ArrayList;

public class Allpath {
     public static class Edge{
    int sour;
    int dest;
    public Edge(int sour,int dest){
      this.sour = sour;
      this.dest = dest;
    }
  }
     public static void CreateAgraph(ArrayList<Edge>[] graph){
     
   for(int i = 0;i<graph.length;i++){
    graph[i] = new ArrayList<>();
   }    
   graph[0].add(new Edge(0, 3));

   graph[2].add(new Edge(2, 3));
   
   graph[3].add(new Edge(3, 1));
   
   graph[4].add(new Edge(4, 0));
   graph[4].add(new Edge(4, 1));

   graph[5].add(new Edge(5, 0));
   graph[5].add(new Edge(5, 2));
   
  }
public static void printAllPath(ArrayList<Edge> graph[], int sour,int dest,String path){
    if(sour == dest){
        System.out.println(path+dest);
        return;
    }
    for(int i = 0;i<graph[sour].size();i++){
        Edge e = graph[sour].get(i);
        printAllPath(graph, e.dest, dest, path+sour);
    }
}
    public static void main(String[] args) {
        
    }
    
}
