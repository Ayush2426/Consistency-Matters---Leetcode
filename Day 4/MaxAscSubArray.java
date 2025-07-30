

public class MaxAscSubArray {
    public int MaxAscSub(int[] nums){
        int max = nums[1];
        int curMax = nums[1];
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]){
                curMax += nums[i];
            }else{
                max = Math.max(max, curMax);
                curMax = nums[i];
            }
            max = Math.max(max, curMax);
        }

        return max;
    }
    public static void main(String[] args) {
        MaxAscSubArray masa = new MaxAscSubArray();
        masa.MaxAscSub(new int[]{10, 20, 30, 40, 21, 2});
    }
}
