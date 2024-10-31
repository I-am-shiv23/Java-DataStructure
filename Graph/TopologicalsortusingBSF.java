package Graph;

import java.util.*;
// Topological sorting by using BSF
public class TopologicalsortusingBSF {
    public static class Edge{
        int sour;
        int dest;
        public Edge(int sour, int dest){
            this.sour =sour;
            this.dest = dest;
        }
    }
    public static void calcIndeg(ArrayList<Edge>graph[],int indeg[]){
        for(int i = 0;i<graph.length;i++){
            int v = i;
            for(int j = 0;i<graph[v].size();j++){
             Edge e = graph[v].get(j);
             indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i =0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
         }
         System.out.println();
    }
    public static void main(String[] args) {
        
    }
    
}
