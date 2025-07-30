public class MostWaterContainer {
    public int maxWater(int[] height){
        int maxCapacity = 0, st = 0, end = height.length - 1, minHeight = 0, width = 0;
        while(st < end){
            minHeight = Math.min(height[st], height[end]);
            width = end - st;
            int currCap = minHeight * width;

            maxCapacity = Math.max(currCap, maxCapacity);

            if(height[st] < height[end]){
                st++;
            }else{
                end--;
            }
        }
        return maxCapacity;
    }
    public static void main(String[] args) {
        MostWaterContainer mwc = new MostWaterContainer();
        mwc.maxWater(new int[]{1,2,3,5,7,4,8});
    }
}
