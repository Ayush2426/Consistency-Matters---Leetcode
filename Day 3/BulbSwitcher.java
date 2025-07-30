public class BulbSwitcher {
    public int countActiveBulbs(int n){
        int count = 0;
        int i = 1;
        while(i * i <= n){
            count++;
            i++;
        }
        return count;
    }    
    public static void main(String[] args) {
        BulbSwitcher bulbSwitcher = new BulbSwitcher();
        int n = 10; // Example input
        int result = bulbSwitcher.countActiveBulbs(n);
        System.out.println("Number of active bulbs after " + n + " switches: " + result);
    }
}
