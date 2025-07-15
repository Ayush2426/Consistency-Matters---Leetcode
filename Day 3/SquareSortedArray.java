public class SquareSortedArray {
    public int[] squareSorted(int[] nums){
        int [] ans = new int[nums.length];
        int start = 0;
        int end = nums.length  -1;
        int newEnd = 0;
        while(start <= end){
            int Is = nums[start] * nums[start];
            int Fs = nums[end] * nums[end];
            if(Is > Fs){
                ans[newEnd] = Is;
                start++;
            }else{
                ans[newEnd] = Fs;
                end--;
            }
            newEnd--;
        }
        return ans;
    }    
    public static void main(String[] args) {
        SquareSortedArray ssa = new SquareSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = ssa.squareSorted(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
