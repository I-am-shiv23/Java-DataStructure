package Graph;
import java.util.ArrayList;

import Arrays2D.create2darr;
public class BellmanFord {
       static class Edge{
        int s;
        int d;
        int w;
           public Edge(int s,int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
       }
       public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 1, 4));
        //1
        graph[1].add(new Edge(1, 2, -4));
       
        //2
        graph[2].add(new Edge(2, 3, 2));

        //3
        graph[3].add(new Edge(3, 4, 4));
        
        //4
        graph[4].add(new Edge(4, 1, -1));
       }
       public static void bellmanford(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i= 0;i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        
        for(int i = 0;i<V-1;i++){
            for(int j = 0;j<graph.length;j++){
                for(int k = 0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    int u = e.s;
                    int v = e.d;
                    int wt = e.w;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                          dist[v] = dist[u]+wt;
                    }
                }
            }
        }
        for(int i = 0;i<dist.length;i++){
            System.out.println(dist[i] + " ");
        }
        System.out.println();
       }
        public static void main(String[] args) {
              int v = 5;
            ArrayList<Edge>[] graph = new ArrayList[v];  
            CreateGraph(graph);
            bellmanford( graph, 0);
        }
    }



