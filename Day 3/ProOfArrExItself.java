public class ProOfArrExItself {
    public int[] ProOfarrExItself(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;        
    }
    public static void main(String[] args) {
        ProOfArrExItself proOfArrExItself = new ProOfArrExItself();
        int[] nums = {1, 2, 3, 4};
        int[] result = proOfArrExItself.ProOfarrExItself(nums);
        System.out.print("Product of array except itself: ");
        for(int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
