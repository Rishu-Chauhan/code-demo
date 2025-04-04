import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class TopologicalSort {
    public static void topo(int node,List<List<Integer>> adj,  boolean visited[],Stack<Integer> s){
        visited[node]=true;
        for(int neigh:adj.get(node)){
            if(!visited[neigh]){
                topo(neigh, adj, visited, s);
            }
        }
        s.push(node);
    }
    public static void main(String[] args) {
         int V=4;
         Stack<Integer> s=new Stack<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
        }
         boolean visited[]=new boolean[V];

         adj.get(0).add(1);
         adj.get(0).add(2);
         adj.get(1).add(3);
         adj.get(2).add(3);
      
         for(int i=0;i<V;i++){
            if(!visited[i]){
                topo(i, adj, visited, s);
            }
         }
         List<Integer> ans=new ArrayList<>();
         while(!s.isEmpty()){
            ans.add(s.pop());
         }
         System.out.println(ans+" ");
    }
}
