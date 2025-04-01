import java.util.Scanner;

public class undirctedAndWeighted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Vertes");
        int vert=sc.nextInt();
         int adjMat[][]=new int[vert][vert];
        System.out.println("Enter No. of edges");
        int edge=sc.nextInt();

        System.out.println("Enter the edges and wieght (start and end vertes)");
        for(int i=0;i<edge;i++){
            int startVer=sc.nextInt();
            int endVer=sc.nextInt();
            int wieght=sc.nextInt();

            adjMat[startVer][endVer]=wieght;
            adjMat[endVer][startVer]=wieght;
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
