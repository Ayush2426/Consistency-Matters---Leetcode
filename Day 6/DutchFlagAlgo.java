public class DutchFlagAlgo {
    public void dutchAlgo(int[] nums){
        int l = 0, m = 0, h = nums.length - 1;

        while(m <= h){
            if(nums[m] == 0){
                swap(nums, l, m);
                m++;
                l++;
            }else if(nums[m] == 1){
                m++;
            }else{
                swap(nums, m, h);
                h--;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
    public static void main(String[] args) {
        DutchFlagAlgo dfa = new DutchFlagAlgo();
        dfa.dutchAlgo(new int[]{1, 2, 2, 2, 1, 0, 1, 1});
    }
}
