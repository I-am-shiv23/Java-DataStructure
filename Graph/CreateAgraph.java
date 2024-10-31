 package Graph;
//Create a Graph(Adjacency List)
import java.util.ArrayList;

public class CreateAgraph {
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
    public static void main(String[] args) {
         /*
           *        (5)
                  0-------1
                         / \
                     (1)/   \ (3)
                       /     \
                      2-------3
                      |   (1)
                 (2)  |
                      |
                      4
          */           
          int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];  
         
        for(int i = 0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0, 1, 5));

        //1
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1,2,1));
       
        //2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        
        //4
        graph[4].add(new Edge(4, 2, 2));


        for(int i = 0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
        System.out.println(e.d);
        }
                


    }
}