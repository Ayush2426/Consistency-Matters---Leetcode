public class FibonacciSeries {
    public void getFib(int x) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (x < 0) {
            System.out.println("Invalid input");
        }else if(x == 1){
            System.out.println(a);
        }else{
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i <= x; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
            System.out.println("Fibonacci series up to " + x + " terms: "+c);
        }
    }
    public static void main(String[] args) {
        FibonacciSeries fb = new FibonacciSeries();
        fb.getFib(2);
    }
}
