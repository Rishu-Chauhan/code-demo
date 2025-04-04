import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class Pair{
    int node;
    int parent;
    Pair(int node,int parent){
        this.node=node;
        this.parent=parent;

    }
}
public class DetectCycleBFS {
    public static boolean cycle(int vertex,List<List<Integer>> adj,boolean []visited){
        Queue<Pair> q=new LinkedList();
        visited[vertex]=true;
        q.offer(new Pair(vertex, -1));
        while(!q.isEmpty()){
            Pair currPair=q.poll();
            int node=currPair.node;
            int parent=currPair.parent;
            for(int neigh:adj.get(node)){
                if(parent==neigh){
                    continue;
                }
                if(visited[neigh]){
                    return true;
                }
                visited[neigh]=true;
                q.offer(new Pair(neigh,node));

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
        }
         boolean visited[]=new boolean[V];
         adj.get(0).add(1);
         adj.get(0).add(4);
         adj.get(1).add(0);
         adj.get(1).add(2);
         adj.get(2).add(3);
         adj.get(2).add(1);
         adj.get(3).add(4);
         adj.get(3).add(2);
         adj.get(4).add(0);    
        adj.get(4).add(3);   
         
         for(int i=0;i<V;i++){
            if(!visited[i]){
                if(cycle(i, adj, visited)){
                    System.out.println("Cycle detected");
                }else{
                    System.out.println("No Cycle detected");
                }
            }
   
         }
        
    }
}
