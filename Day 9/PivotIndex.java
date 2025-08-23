public class PivotIndex {
    public int findPivot(int[] nums) {

        int rsum = 0, lsum = 0;

        for (int num : nums) {
            rsum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];

            if (lsum == rsum) {
                return i;
            }

            lsum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pi = new PivotIndex();
        pi.findPivot(new int[] { 1, 7, 3, 6, 5, 6 });
    }
}
