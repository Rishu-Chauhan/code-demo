import java.util.Scanner;

public class undirectedAndUnweighted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Vertes");
        int vert=sc.nextInt();
         int adjMat[][]=new int[vert][vert];
        System.out.println("Enter No. of edges");
        int edge=sc.nextInt();

        System.out.println("Enter the edge (start and end vertes)");
        for(int i=0;i<edge;i++){
            int startVer=sc.nextInt();
            int endVer=sc.nextInt();

            adjMat[startVer][endVer]=1;
            adjMat[endVer][startVer]=1;
        }

        for(int i=0;i<vert;i++){
            for(int j=0;j<vert;j++){
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
