public class RecursiveSearch {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst(int data){
            //creating newNode
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return ;
            }
            //newNode's next head
            newNode.next=head;
            //head =newNode
            head=newNode;
        }
        
    public void printLL(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        RecursiveSearch ll=new RecursiveSearch();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();

       System.out.println( ll.recSearch(3));
       System.out.println( ll.recSearch(30));
    }
}
