public class UniqueInSortedArray {
    public int findUniqueInSorted(int[] nums){

        if(nums[0] != nums[1] || nums.length == 1 ){
            return nums[0];
        }else if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }

        int st = 0, end = nums.length - 1;

        while(st <= end){
            int mid = (st + end)/2;
            
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid +1]){
                return nums[mid];
            }else if(mid % 2 == 0 && nums[mid] == nums[mid + 1]){
                end = mid - 1;
            }else{
                if(nums[mid] == nums[mid - 1]){
                    st = mid + 1;
                }
            }
        }
        
        return -1;
    }
}
