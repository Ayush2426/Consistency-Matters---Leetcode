public class RotatedSortedSearch {
    public int RotatedSearch(int[] nums, int target) {
        int ans = -1, st = 0, end = nums.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target <= nums[mid]) {
                if (target >= nums[st] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else if (target >= nums[mid]) {
                if (target <= nums[end] && target >= nums[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        RotatedSortedSearch rss = new RotatedSortedSearch();
        rss.RotatedSearch(new int[]{50, 60, 70, 10, 20, 30, 40}, 50);
    }
}
