import java.util.PriorityQueue;

public class KthLargestElement {

    public static int largest(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=3;
        System.out.println(largest(arr, k));
    }
}