import java.util.ArrayList;
public class MaximumEl {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=0;i<list.size();i++){
         maxi=Math.max(maxi,list.get(i));
        }
        System.out.println("Maximum element ="+maxi);
    }
}
