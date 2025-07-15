

public class TwoSums{
    public void findTwoSums(int[] nums, int target){
        if(nums == null || nums.length<2){
            System.out.println("Invalid input");
            return;
        }
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println("Indices of the two numbers that add up to " + target + " are: " + ans[0] + " and " + ans[1]);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        TwoSums ts = new TwoSums();
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        ts.findTwoSums(nums, target);
    }
}