public class RotatedArraySearchMin {
    public int RotatedMinSearchArray(int[] nums){
        int st = 0, end = nums.length - 1;
        if(nums.length == 1 || nums[st] < nums[end]){
            return nums[0];
        }
        
        while(st <= end){
            int mid = (st + end)/2;

            if(mid != 0 && nums[mid - 1] > nums[mid]){
                return nums[mid];
            }else if(nums.length - 1 != mid && nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }else if(nums[st] <= nums[end]){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        RotatedArraySearchMin rasm = new RotatedArraySearchMin();
        rasm.RotatedMinSearchArray(new int[]{50, 60, 70, 80, 90, 10, 20, 30, 40});
    }
}
