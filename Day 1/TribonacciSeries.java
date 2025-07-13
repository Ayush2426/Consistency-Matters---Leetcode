public class TribonacciSeries {
    public int getTri(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int ft = 0;
            int st = 1;
            int tt = 1;
            for (int i = 1; i <= n; i++) {
                int fot = ft + st + tt;
                ft = st;
                st = tt;
                tt = fot;
            }
            return ft;
        }
    }

    public static void main(String[] args) {
        TribonacciSeries T = new TribonacciSeries();
        int result = T.getTri(25);
        System.out.println("Tribonacci number at position 4 is: " + result);
    }
}
