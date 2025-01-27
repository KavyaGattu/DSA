package sample;
import java.util.*;
public class DFSgraph {
    int V;
    ArrayList<Integer>[]adjList;

    public DFSgraph(int V) {
       this.V=V;
       adjList=new ArrayList[V];
       for(int i=0;i<V;i++)
       {
          adjList[i]=new ArrayList<>();
       }
    }      
    public void addEdge(int src,int des)
    {
        adjList[src].add(des);
    }
    public void dfs(int startvertex)
    { 
        boolean visited[]=new boolean[V];
        visited[startvertex]=true;
        System.out.print("dfs traversal from vertex"+startvertex);
        System.out.println();
        dfsutil(startvertex,visited);
        System.out.println();

    }
    public void dfsutil(int current,boolean visited[])
    {
         visited[current]=true;
         System.out.print(current+" ");
         for(int neigh:adjList[current])
         {
            if(!visited[neigh])
            {
                visited[neigh]=true;
                dfsutil(neigh, visited);
            }
         }
    }
    public static void main(String args[])
    {
        DFSgraph graph=new DFSgraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.dfs(0);
    }
    
    
}
