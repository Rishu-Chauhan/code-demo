import java.util.ArrayList;
import java.util.List;

public class DetectCycleDirectedGraph {
    public static boolean detectCycle(int node,List<List<Integer>> adj,boolean path[],boolean visited[]){
        visited[node]=true;
        path[node]=true;
        for(int neigh:adj.get(node)){
            if(path[neigh]){
                return true;
            }
            if (!visited[neigh] && detectCycle(neigh, adj, path, visited)) {
                return true; // Recursively check neighbors
            }
        }
        path[node]=false;
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        boolean[] path = new boolean[V];
        boolean[] visited = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(3);
        adj.get(0).add(2);
        adj.get(2).add(3);

        for (int i = 0; i < V; i++) {
            if (!visited[i] && detectCycle(i, adj, path, visited)) {
                System.out.println("Cycle detected!");
                return;
            }
        }
        System.out.println("No cycle detected.");
    }
}
