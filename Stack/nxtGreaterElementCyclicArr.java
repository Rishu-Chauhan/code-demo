import java.util.*;
public class nxtGreaterElementCyclicArr {
    public static void main(String[] args) {
        int nums[]={1,2,1};
        int n=nums.length;
        int nxtGreater[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            nxtGreater[i]=-1;
        }
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i%n]){
                s.pop();
            }
            if(!s.isEmpty()){
                nxtGreater[i%n]=nums[s.peek()];
            }
            s.push(i%n);
        }
        for(int i=0;i<n;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
