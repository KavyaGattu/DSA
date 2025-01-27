package sample;

import java.util.*;

public class TopologicalSort {
    public static List<Integer> topologicalSort(int vertices, List<List<Integer>> adjacencyList) {
        int[] inDegree = new int[vertices];

        for (List<Integer> edges : adjacencyList) {
            for (int neighbor : edges) {
                inDegree[neighbor]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        List<Integer> topologicalOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            topologicalOrder.add(currentVertex);
            
            for (int neighbor : adjacencyList.get(currentVertex)) {
                inDegree[neighbor]--;
                
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
       
        if (topologicalOrder.size() != vertices) {
            throw new IllegalArgumentException("The graph is not a Directed Acyclic Graph (DAG)");
        }
        
        return topologicalOrder;
    }

    public static void main(String[] args) {
        
        int vertices = 6;

        
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        
        adjacencyList.get(5).add(2);
        adjacencyList.get(5).add(0);
        adjacencyList.get(4).add(0);
        adjacencyList.get(4).add(1);
        adjacencyList.get(2).add(3);
        adjacencyList.get(3).add(1);

        try {
            
            List<Integer> result = topologicalSort(vertices, adjacencyList);
            System.out.println("Topological Sort: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
