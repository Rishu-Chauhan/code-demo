import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFSTraversal {
    public static List<Integer> bfs(int V, List<List<Integer>> adj) {
        List<Integer> ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();

        visited[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int neighbour:adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
          int V = 5; 
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
         // Example graph (undirected)
         adj.get(0).add(1);
         adj.get(0).add(2);
         adj.get(1).add(0);
         adj.get(1).add(3);
         adj.get(2).add(0);
         adj.get(2).add(4);
         adj.get(3).add(1);
         adj.get(4).add(2);

         List<Integer> res=bfs(V, adj);
         System.out.print(res);

    }
}
