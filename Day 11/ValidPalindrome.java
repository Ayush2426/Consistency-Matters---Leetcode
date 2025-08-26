public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= 'a' && c >= 'z') {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
                sb.append(c);
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }

        int st = 0, end = sb.length() - 1;

        while (st < end) {
            char lc = sb.charAt(st);
            char rc = sb.charAt(end);
            if (lc != rc) {
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        vp.isPalindrome("r ad a r");
    }
}
