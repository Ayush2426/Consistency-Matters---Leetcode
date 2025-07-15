public class SquareSortedArray {
    public int[] squareSorted(int[] nums){
        int [] ans = new int[nums.length];
        int start = 0;
        int end = nums.length  -1;
        int newEnd = 0;
        while(start <= end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[newEnd] = nums[start] * nums[start];
                start++;
            } else {
                ans[newEnd] = nums[end] * nums[end];
                end--;
            }
            newEnd++;
        }
        return ans;
    }    
    public static void main(String[] args) {
        SquareSortedArray ssa = new SquareSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = ssa.squareSorted(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
