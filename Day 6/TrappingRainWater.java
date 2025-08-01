public class TrappingRainWater {
    public int RainWater(int[] height){
        int n = height.length;
        int[] leftHeight = new int[n];
        int[] rightHeight = new int[n];
        leftHeight[0] = height[0];
        rightHeight[0] = height[n - 1];
        for(int i = 1; i<=n; i++){
            leftHeight[i] = Math.max(leftHeight[i - 1], height[i]);
        }
        for(int i = n - 2; i >= 0; i--){
            rightHeight[i] = Math.max(rightHeight[i + 1], height[i]);
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            ans = Math.min(rightHeight[i], leftHeight[i]) - height[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        trw.RainWater(new int[]{1, 2, 3, 0, 4, 0, 6, 2, 3});
    }
}
