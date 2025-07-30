public class NumTwiceOfOthers {
    public int TwiceOfOthers(int[] nums) {
        int max = -1, smax = -1, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxIndex = i;
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }

        if (smax * 2 < max) {
            return maxIndex;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        NumTwiceOfOthers Ntc = new NumTwiceOfOthers();
        Ntc.TwiceOfOthers(new int[] {3, 6, 1, 2});
    }
}
