public class SearchInLL {
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
    public static int searchKey(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchInLL ll=new SearchInLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
       System.out.println( "List is found at index="+ll.searchKey(3));
    }
}
