public class StringCompression {
    public int stringcompression(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[i]) {
                if (count > 1) {
                    sb.append(count + "");
                }
                sb.append(chars[i]);
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            sb.append(count + "");
        }
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            chars[i] = c;
        }
        return sb.length();
    }
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        sc.stringcompression(new char[]{'a', 'a', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c', 'd', 'd'});
    }
}
