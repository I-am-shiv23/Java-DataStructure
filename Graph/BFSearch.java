package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.CreateAgraph.Edge;

public class BFSearch {

    public static class Edge {
        int s, d, w;

        Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }

    }

    public static void CreateAgraph(ArrayList<Edge>[] graph) {
      
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        // 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        

        // 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        
        graph[5].add(new Edge(6, 5, 1));


    }
       public static void BFS(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vish[] = new boolean[graph.length];
         
        q.add(0);         
      while(!q.isEmpty()){
        int curr = q.remove();
            if(!vish[curr]){
                System.out.print(curr + " ");
                vish[curr] = true;
               
                for(int j = 0;j<graph[curr].size();j++){
                    Edge e = graph[curr].get(j);
                    q.add(e.d);
                }
            }
        }

       }
    public static void main(String[] args) {
       /*
                   1-----3
                  /     | \
                 0      |  5--6
                  \     | /
                   2----4 */
                           
          int v = 7;
          ArrayList<Edge> graph[] = new ArrayList[v];
        CreateAgraph(graph);
        
        BFS(graph);
        
    }
}
