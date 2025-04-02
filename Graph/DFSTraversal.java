import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {
    public static void DFS(int node, List<List<Integer>> adj,boolean[] visited,List<Integer>ans){
        visited[node]=true;
        ans.add(node);
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                DFS(neighbour, adj, visited, ans);
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        boolean visited[]=new boolean[V];
        List<Integer> ans=new ArrayList<>(); 
            
     
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        DFS(0, adj, visited, ans);
        System.out.println(ans);
    }
}
