//import java.lang.classfile.components.ClassPrinter.ListNode;

public class RemoveCycleLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public  void remove(){
      
          RemoveCycleLL.Node slow=head;
        RemoveCycleLL.Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return ;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
          prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
       prev.next=null;
    }
   public static void main(String[] args) {
    RemoveCycleLL list =new RemoveCycleLL();
    list.head = new Node(1);
    Node temp=new Node(2);
    list.head.next =temp;
    list.head.next.next = new Node(3);
    list.head.next.next.next = temp;

    System.out.println(list.isCycle());
  list.remove();
   } 
}
