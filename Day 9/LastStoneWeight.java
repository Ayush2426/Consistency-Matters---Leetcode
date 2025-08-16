
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int LSW(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int k : nums) {
            pq.add(k);
        }

        while (pq.size() > 1) {
            int max = pq.remove();
            int smax = pq.remove();

            int newStone = max - smax;

            if (newStone != 0) {
                pq.add(newStone);
            }
        }
        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.remove();
        }
    }

    public static void main(String[] args) {
        LastStoneWeight lsw = new LastStoneWeight();
        lsw.LSW(new int[] { 1, 1, 2, 4, 8, 7 });
    }
}
