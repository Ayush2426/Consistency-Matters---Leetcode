public class PowerOfTwo {
    public boolean isPower(int x){
        if(x < 1){
            return false;
        }else if(x == 1){
            return true;
        }else{
            while(x % 2 == 0){
                x = x/2;
            }
            if(x == 1){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        PowerOfTwo po = new PowerOfTwo();
        boolean result = po.isPower(17);
        if(result){
            System.out.println("Is power of 2");
        }else{
            System.out.println("Not power of 2");
        }
    }
}
