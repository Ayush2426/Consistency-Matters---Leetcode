public class MaxSubArr {
    public int KadaneAlgo(int[] nums){
        int sum = nums[0];
        int maxSum = nums[0];
        if(nums.length == 1){
            System.out.println(maxSum);
        }
        for(int i = 1; i < nums.length; i++){
            if(sum + nums[i] > nums[i]){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSubArr msa = new MaxSubArr();
        msa.KadaneAlgo(new int[]{1, 2, -2, 5, -4, 3, 2, 1});
    }
}

