public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
         
    }
    public static Node head;
         public static Node tail;
         public static int size;
    //addfirst
    public void addFirst(int data){
        Node newNode=new Node(data);
       size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            size--;
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static void main(String[]args){
   DoubleLL ll=new DoubleLL();
   ll.addFirst(9);
   ll.addFirst(8);
   ll.addFirst(7);
   ll.print();
   System.out.println(ll.size);
   ll.removeFirst();
   ll.print();
   System.out.println(ll.size);
    }
}
