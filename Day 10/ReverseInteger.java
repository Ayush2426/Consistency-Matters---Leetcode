class ReverseInteger {
    public int reverse(int x) {
        int ans = 0;

        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            ans = ans * 10 + digit;
            temp = temp / 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        ri.reverse(213);
    }
}