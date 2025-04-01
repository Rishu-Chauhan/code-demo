import java.util.Scanner;
import java.util.ArrayList;

public class UndirctedGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO. of Vertex");
        int ver=sc.nextInt();
        System.out.println("Enter NO. of Edges");
        int edge=sc.nextInt();
     ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
     for (int i = 0; i < ver; i++) {
        adjList.add(new ArrayList<>());
    }

    System.out.println("Enter vertex ->Edges");
    for(int i=0;i<edge;i++){
       
        int u=sc.nextInt();
        int v=sc.nextInt();

        adjList.get(u).add(v); // Add v to the list of u
        adjList.get(v).add(u);
    }

    for(int i=0;i<adjList.size();i++){
        System.out.print("Vert "+ i +"->");
        for(int neighbour : adjList.get(i)){
            System.out.print(" "+neighbour);
        }
        System.out.println();
    }
    }
}
