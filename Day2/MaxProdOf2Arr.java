public class MaxProdOf2Arr {
    public int MaxProdof2arr(int[] nums){
        int max = -1;
        int smax = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                smax = max;
                max = nums[i];
            }else if(smax < nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max-1) * (smax-1);
        return ans;
    }
    public static void main(String[] args) {
        MaxProdOf2Arr mOf2Arr = new MaxProdOf2Arr();
        int[] nums = {3, 4, 5, 2};
        int result = mOf2Arr.MaxProdof2arr(nums);
        System.out.println("Maximum product of two elements in the array is: " + result);
    }
}
