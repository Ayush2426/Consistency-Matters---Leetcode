
import java.util.HashMap;

public class FindDuplicate {
    public int findDup(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                return num;
            }else{
                map.put(num, 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        fd.findDup(new int[]{1, 2, 3, 4, 5, 2});
    }
}
