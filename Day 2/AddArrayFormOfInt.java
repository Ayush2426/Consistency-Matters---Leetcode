import java.util.*;
public class AddArrayFormOfInt {
    public void addArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0) {
            int numVal = 0;
            if (p >= 0) {
                numVal = num[p];
            }

            int d = k % 10;
            int sum = numVal + d + carry;
            carry = sum / 10;
            int digit = sum % 10;
            res.add(digit);
            p--;
            k = k / 10;
        }

        if (carry > 0) {
            res.add(carry);
        }
        Collections.reverse(res);
        System.out.println(res);
    }

    public static void main(String[] args) {
        AddArrayFormOfInt aafoi = new AddArrayFormOfInt();
        int[] inp = { 1, 2, 3, 4 };
        int req = 43;
        aafoi.addArrayForm(inp, req);
    }
}
