import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[]={6,8,0,1,3};
        int nxtGreater []=new int [nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
        while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nxtGreater[i]=-1;
        }
        else{
            nxtGreater[i]=nums[s.peek()];
        }
        s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
        System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
