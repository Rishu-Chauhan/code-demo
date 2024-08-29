public class RemoveFromLast {
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
    public void DeleteFromLast(int n){
        // size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String[]args){
      RemoveFromLast ll=new RemoveFromLast();
      ll.addFirst(5);
      ll.addFirst(4);
      ll.addFirst(3);
      ll.addFirst(2);
      ll.addFirst(1);
      ll.printLL();
      ll.DeleteFromLast(3);
      ll.printLL();
    }
}
