public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
         
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static int height(Node root){
        if(root==null){
           return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
       }

       public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDia=Diameter(root.left);
        int leftH=height(root.left);
        int rightDai=Diameter(root.right);
        int rightH=height(root.right);

        int selfDia=leftH+rightH+1;
         return    Math.max(selfDia,Math.max(leftDia,rightDai));
       }

       static class Info{
        int diam;
        int ht;

       public Info(int daim,int ht){
            this.diam=daim;
            this.ht=ht;
        }
       }
       public static Info diameter(Node root){
        if(root==null){
            return 0;
        }
       Info leftInfo=diameter(root.left);
       Info rightInfo=diameter(root.right);

       int finalDiam=Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.ht+rightInfo.ht +1);
       int ht=Math.max(leftInfo.ht,rightInfo.ht);
       
       return new Info(finalDiam, ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        
      System.out.println(diameter(root).finalDiam);
    }
}
