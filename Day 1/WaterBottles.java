public class WaterBottles {
    public int BottlesDrink(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles >= numExchange){
            int newBottles =  numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }
    public static void main(String[] args) {
        WaterBottles wb = new WaterBottles();
        int result = wb.BottlesDrink(9, 3);
        System.out.println("Total bottles that can be drunk: " + result);
    }
}
