import java.util.*;
public class MaxAreaHistogram {
    public static void maxArea(int nums[]){
        int maxAr=0;
        int nsl []=new int[nums.length];
        int nsr []=new int [nums.length];
     Stack<Integer> s=new Stack<>();
      for(int i=nums.length-1;i>=0;i--){
        while(!s.isEmpty() && nums[s.peek()]>=nums[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=nums.length;
        }
        else{
            nsr[i]=s.peek();
        }
        s.push(i);
      }

      s=new Stack<>();
      for(int i=0;i<nums.length;i++){
        while(!s.isEmpty() && nums[s.peek()]>=nums[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }
        else{
            nsl[i]=s.peek();
        }
        s.push(i);
      }

     //curr Area
      for(int i=0;i<nums.length;i++){
        int height=nums[i];
        int width=nsr[i]-nsl[i]-1;
        int currArea=height*width;
        maxAr=Math.max(currArea,maxAr);
      }
      System.out.println("Maximum Area of histogram = "+maxAr);
    }
    public static void main(String[] args) {
        int nums[]={2,1,5,6,2,3};
        maxArea(nums);
    }
}
