import java.util.ArrayList;

public class OperationOnList {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    //Add
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);

    //get
    int n=list.get(3);
    System.out.println(n);

    //remove
    list.remove(1);
    System.out.println(list);

    //setElemAtIndx
    list.set(2,10);
    System.out.println(list);

    //contains
    System.out.println(list.contains(3));
    System.out.println(list.contains(17));
  }  
}
