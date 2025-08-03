public class PlusOne {
    public int[] plusone(int[] nums){
        int n = nums.length;
        int[] ans = new int[n + 1];

        if(nums[n - 1] != 9){
            nums[n - 1] = nums[n - 1] + 1;
            return nums;
        }

        nums[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] != 9){
                nums[i] = nums[i] + 1;
                return nums;
            }

            nums[i] = 0;
        }
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        po.plusone(new int[]{1, 2, 3, 4, 5});
    }
}
