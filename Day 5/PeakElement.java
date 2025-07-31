
public class PeakElement {
    public int Peak(int[] nums){
        if(nums.length == 1 || nums[0] > nums[1]){
            return 0;
        }else if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }

        int st = 0, end = nums.length - 1;

        while(st <= end){
            int mid = (st + end)/2;
            if(nums[mid] > nums[mid + 1] & nums[mid] > nums[mid - 1]){
                return mid;
            }else if(nums[st] < nums[end]){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        pe.Peak(new int[]{1, 2, 4, 5, 6, 5, 4});
    }
}
