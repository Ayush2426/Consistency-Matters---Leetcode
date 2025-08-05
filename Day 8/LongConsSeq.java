
import java.util.HashMap;

public class LongConsSeq {
    public int consSeqLong(int[]  nums){
        HashMap<Integer, Boolean> map = new HashMap<>();
        int maxStreak = 0;

        for(int k : nums){
            map.put(k, false);
        }
        for (int k : map.keySet()) {
            if(map.containsKey(k - 1) == false){
                map.put(k, true);
            }
        }

        for(int k : map.keySet()){
            int tempStreak = 1;
            if(map.get(k) == true){
                while(map.containsKey(k + tempStreak)){
                    tempStreak++;
                }
            }

            maxStreak = Math.max(tempStreak, maxStreak);
        }
        return  maxStreak;
    }
    public static void main(String[] args) {
        LongConsSeq lcs = new LongConsSeq();
        lcs.consSeqLong(new int[]{1, 2, 32, 33, 43, 3, 4, 6, 5, 7});
    }
}
