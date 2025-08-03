import java.util.*;
public class KthLargestElement {
    public int KthLargestElement(int[] nums, int target){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            if(pq.size() < target){
                pq.add(nums[i]);
            }else if(pq.peek() < nums[i]){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        KthLargestElement kle = new KthLargestElement();
        kle.KthLargestElement(new int[]{1, 2, 3, 1, 2, 7, 2, 7, 4, 5}, 3);
    }
}
