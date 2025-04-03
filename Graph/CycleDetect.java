import java.util.ArrayList;
import java.util.List;

public class CycleDetect {
    public static boolean cycle(int node,int parent,List<List<Integer>> adj,boolean [] visited){
        visited[node]=true;
        for(int neighbour:adj.get(node)){
            if(parent==neighbour){
                continue;
            }
            if(visited[neighbour]==true){
                return true;
            }
           if(cycle(neighbour, node, adj, visited)){
            return true;
           }
        }
        return false;
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
                if(cycle(i, -1, adj, visited)){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }
       
    }
}
