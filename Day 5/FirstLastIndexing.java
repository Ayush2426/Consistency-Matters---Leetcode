public class FirstLastIndexing {
    public int[] FirLasInd(int[] nums, int target){
        int[] ans = {-1, -1};

        if(nums.length == 0){
            return  ans;
        }else{
            ans[0] = firstOccur(nums, target);
            ans[1] = lastOccur(nums, target);
            return ans;
        }


    }
    public int firstOccur(int[] nums, int target){
        int st = 0, end = nums.length - 1;
        int ans = -1;
        
        while(st <= end){
            int mid = (st + end)/2;
            
            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
    public int lastOccur(int[] nums, int target){
        int st = 0, end = nums.length - 1;
        int ans = -1;
        
        while(st <= end){
            int mid = (st + end)/2;
            
            if(nums[mid] == target){
                ans = mid;
                st = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FirstLastIndexing fli = new FirstLastIndexing();
        fli.FirLasInd(new int[]{10, 20, 20, 30, 40}, 20);
    }
}
