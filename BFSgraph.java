package sample;
import java.util.*;
public class BFSgraph {
    int V;
    ArrayList<Integer>[]adjList;
    public BFSgraph(int V)
    {
        this.V=V;
        adjList=new ArrayList[V];
        for (int i=0;i<V;i++)
        {
            adjList[i]=new ArrayList<>();
        }
    }
    public void addEdge(int src, int des)
    {
        adjList[src].add(des);
    }
    public void bfsgraph(int startvertex)
   {
       boolean visited[]=new boolean[V];
       Queue<Integer> queue=new LinkedList<>();
       visited[startvertex]=true;
       queue.add(startvertex);
       System.out.println("traversal from startvertex"+startvertex);
       while(!queue.isEmpty())
       {
            int current=queue.poll();
            System.out.print(current+"->");

       for(int neigh:adjList[current])
       {
            if(!visited[neigh])
            {
                visited[neigh]=true;
                queue.add(neigh);
            }
       }
    }
    System.out.println();

   }
   public static void main(String args[])
   {
      BFSgraph graph=new BFSgraph(5);
      graph.addEdge(0, 1);
      graph.addEdge(0,2);
      graph.addEdge(1,2);
      graph.addEdge(2,3);
      graph.addEdge(3,4);
      graph.bfsgraph(0);


   }
    
}
