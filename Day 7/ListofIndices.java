import java.util.*;
public class ListofIndices {
    public java.util.List<Integer> IndicesList(int[] nums, int target){
        
        List<Integer> list = new ArrayList<>();

        int num = 0, tcount = 0;

        for(int k : nums){
            if(k == target){
                tcount++;
            }else if (k < target){
                num++;
            }
        }
        while(tcount > 0){
            list.add(num);
            num++;
            tcount--;
        }

        return list;
    }
    public static void main(String[] args) {
        ListofIndices li = new ListofIndices();
        li.IndicesList(new int[]{1, 2, 3, 1, 2, 5}, 2);
    }
}
