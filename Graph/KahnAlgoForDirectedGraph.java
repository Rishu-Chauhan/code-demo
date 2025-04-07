import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;;


public class KahnAlgoForDirectedGraph {
    public static boolean cycle(int V,int edges[][]){
        List<List<Integer>> adj=new ArrayList<>();
        int inDeg[]=new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());

        }
        for(int edge[]:edges){
            adj.get(0).add(1);
            inDeg[edge[1]]++;
        }
      Queue<Integer> q=new LinkedList();
      for(int i=0;i<V;i++){
        if(inDeg[i]==0){
            q.add(i);
        }
      }
      List<Integer> ans=new ArrayList<>();
      while(!q.isEmpty()){
        int node=q.poll();
        ans.add(node);
        for(int neigh:adj.get(node)){
            inDeg[neigh]--;
            if(inDeg[neigh]==0){
                q.add(neigh);
            }
        }
      }
      int count=ans.size();
      return count !=V;

    }
    public static void main(String[] args) {
        int V=4;
      int   edges[][] = {{0, 1}, {1, 2}, {2, 3}, {3, 3}};

         if(cycle(V, edges)){
            System.out.println("Cycle detected");
            return;
         }
         else{
            System.out.println("No Cycle detected");
         }
    }
}
