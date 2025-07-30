public class MaxAscSubArray {
<<<<<<< HEAD
    
=======
    public boolean TriMaxSeq(int[] nums){
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE, t = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];

            if(k <= f){
                f = k;
            }else if(k <= s){
                s = k;
            }else{
                t = k;
                return true;
            }
            break;
        }

        return false;
    }
    public static void main(String[] args) {
        MaxAscSubArray masa = new MaxAscSubArray();
        masa.TriMaxSeq(new int[]{1, 3, 4, 2, 5, 8, 1});
    }
>>>>>>> 684b3af41df3036d2e693ad6081f32be1e729cfd
}
