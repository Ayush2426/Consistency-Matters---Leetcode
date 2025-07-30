
import java.util.HashMap;

public class LuckyInteger {
    public int findLucky(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; nums.length < 10; i++) {
            int k = nums[i];

            if(map.containsKey(k)){
                map.put(k, map.get(k)+1);
            }else{
                map.put(k, 1);
            }
        }
        int ans = -1;
        for(int i : map.keySet()){
            if(map.get(i) == i){
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LuckyInteger li = new LuckyInteger();
        li.findLucky(new int[]{1, 2, 2, 3, 4});
    }
}
