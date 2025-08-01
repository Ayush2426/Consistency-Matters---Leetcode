public class SearchInsertPosition {
    public int SearchInsPos(int[] nums, int target) {
        int st = 0, end = nums.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        sip.SearchInsPos(new int[]{10, 20, 30, 40, 60}, 20);
        sip.SearchInsPos(new int[]{10, 20, 30, 40, 60}, 55);
    }
}
