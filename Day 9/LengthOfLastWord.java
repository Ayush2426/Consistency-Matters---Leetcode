public class LengthOfLastWord {
    public int lastwordlength(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c != ' ') {
                count++;
            } else if (count != 0) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord lolw = new LengthOfLastWord();
        lolw.lastwordlength("Hey there im joining tcs");
        lolw.lastwordlength("Hey there im joining tcs    ");
    }
}
