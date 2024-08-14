import java.util.ArrayList;
public class ReverseList {
 public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    //Add
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    int n=list.size();
    System.out.println(list);
    for(int i=n-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
 }   
}
