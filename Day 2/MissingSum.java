public class MissingSum {
    public int findMissingSum(int[] nums){
        int n = nums.length;
        int currentSum = 0;
        int actualSum = n * (n + 1) / 2;
        for(int num : nums){
            currentSum += num;
        }
        return actualSum - currentSum;
    }
    public static void main(String[] args) {
        MissingSum ms = new MissingSum();
        int[] nums = {0, 1, 2, 3, 5}; 
        int missingSum = ms.findMissingSum(nums);
        System.out.println("The missing sum is: " + missingSum);
    }
    
}
