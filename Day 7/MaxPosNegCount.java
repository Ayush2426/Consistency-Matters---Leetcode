public class MaxPosNegCount {
    public int MaxSignConvention(int[] nums){
        int pos = 0, neg = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg++;
            }else if(nums[i] > 0){
                pos++;
            }
        }
        
        return Math.max(pos, neg);
    }
    public static void main(String[] args) {
        MaxPosNegCount mpnc = new MaxPosNegCount();
        mpnc.MaxSignConvention(new int[]{-1, -2, 0, 2, -3, -2, 1, 2});
    }
}
