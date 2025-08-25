public class StringReverse {
    public String revStr(String s) {

        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        String ans = sb.toString().trim();
        return ans;
    }
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.revStr("Hello, Im Ayush Kumar Verma!");
    }
}
