public class ReverseDLL {
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
         public  int size;
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
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        ReverseDLL ll=new ReverseDLL();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
