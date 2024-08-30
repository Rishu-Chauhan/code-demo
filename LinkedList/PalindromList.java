public class PalindromList {
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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
  if(head==null || head.next==null){
    return true;
  }

        //1-findMid
        Node midNode=findMid(head);
        //2-reverse 2nd half
         Node prev=null;
         Node curr=midNode;
         Node next;
         while (curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
         } 
         Node right=prev;
         Node left=head; 
        //3-check left and right half
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
    
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromList ll=new PalindromList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLL();
       System.out.println(ll.checkPalindrome());
    }
}
