
import java.util.*;

public class BoatSave {
    public int boatLimit(int[] nums, int limit) {
        Arrays.sort(nums);

        int st = 0, end = nums.length - 1, count = 0;

        while (st <= end) {
            if (nums[st] + nums[end] <= limit) {
                st++;
                end--;
            }else{
                end--;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        BoatSave bs = new BoatSave();
        bs.boatLimit(new int[]{1, 2, 3, 5, 2, 4, 7, 11}, 8);
    }
}
