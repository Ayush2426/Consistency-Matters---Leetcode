
class Palindrome{
    public boolean isPalindrome(int x){
        if(x <0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while(temp > 0){
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp = temp / 10;
        }
        if(rev == x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        boolean a = p.isPalindrome(236);
        if(a){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not a Palindrome\n");
        }
    }
}