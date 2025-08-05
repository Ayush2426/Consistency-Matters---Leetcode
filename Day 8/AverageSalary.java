public class AverageSalary {
    public double averageSalary(int[] salary){
        int n = salary.length, min = salary[0], max = salary[0];
        double total = 0;

        for(int i = 0; i < salary.length; i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(salary[i] != min && salary[i] != max){
                total += salary[i];
            }
        }
        double avgSal = total / (n - 2);
        return avgSal;
    }
    public static void main(String[] args) {
        AverageSalary as = new AverageSalary();
        as.averageSalary(new int[]{2999, 3000, 3000, 40000, 4200, 7600});
    }
}
