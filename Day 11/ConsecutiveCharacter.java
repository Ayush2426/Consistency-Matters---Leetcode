

public class ConsecutiveCharacter {
    public int characterCount(String s){

        int count = 1;
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);

            if(c1 == c2){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);

        return max;
    }
    public static void main(String[] args) {
        ConsecutiveCharacter cc = new ConsecutiveCharacter();
        cc.characterCount("leetcode");
    }
}
