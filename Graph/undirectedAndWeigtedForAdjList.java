
import java.util.Scanner;
import java.util.ArrayList;

class Pair{
int vertex;
int weight;
Pair(int vertex,int weight){
    this.vertex=vertex;
    this.weight=weight;
}
}
public class undirectedAndWeigtedForAdjList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO. of Vertex");
        int ver=sc.nextInt();
        System.out.println("Enter NO. of Edges");
        int edge=sc.nextInt();
     ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
     for (int i = 0; i < ver; i++) {
        adjList.add(new ArrayList<>());
    }

    System.out.println("Enter vertex ->Edges");
    for(int i=0;i<edge;i++){
       
        int u=sc.nextInt();
        int v=sc.nextInt();
        int weight=sc.nextInt();
        
        adjList.get(u).add(new Pair(v, weight)); // Add (v, weight) to the list of u
        adjList.get(v).add(new Pair(u, weight));
    }

    for(int i=0;i<adjList.size();i++){
        System.out.print("Vert "+ i +"->");
        for(Pair neighbour : adjList.get(i)){
            System.out.print("["+neighbour.vertex + ","+neighbour.weight+"]");
        }
        System.out.println();
    }
    }
}

    
