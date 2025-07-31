public class BinarySearch {
    public int BinarySearch(int[] nums, int target){
        int st = 0, end = nums.length - 1;

        while(st <= end){
            int mid = (st + end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.BinarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    }
}
