public class LinkList {
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

    public void addLast(int data){

    Node newNode=new Node(data); //creating newNode
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;//tail's next newNode
    tail=newNode;//tail=newNode
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
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newnNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
    }

    public void removeLast(){
       if(head==null){
        System.out.println("ll is empty");
        return;
       }
       if(head.next==null){
        head=null;
        return;
       }
       Node secondLast=head;
       Node lastNode=head.next;
       while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
       }
       secondLast.next=null;
       size--;
    }

    public static void main(String[]args){
        LinkList ll=new LinkList();
        ll.printLL();
        ll.addFirst(2); 
        ll.printLL();      
        ll.addFirst(1);
        ll.printLL();     
        ll.addLast(3); 
        ll.printLL();   
        ll.addLast(4);
        ll.printLL();
        ll.addMiddle(2,8);
        ll.printLL();
        System.out.println(ll.size);
       // ll.removeFirst();
       // ll.printLL();
        //System.out.println(ll.size);
       //ll.removeLast();
       // ll.printLL();
       //System.out.println(ll.size);
      
    }
}
