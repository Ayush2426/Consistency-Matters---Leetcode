public class TripletSequence {
    public boolean TriMaxSeq(int[] nums) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE, t = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];

            if (k <= f) {
                f = k;
            } else if (k <= s) {
                s = k;
            } else {
                t = k;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TripletSequence ts = new TripletSequence();
        ts.TriMaxSeq(new int[] { 1, 3, 4, 2, 5, 8, 1 });
    }
}
