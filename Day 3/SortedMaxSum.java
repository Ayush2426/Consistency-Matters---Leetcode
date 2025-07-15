public class SortedMaxSum {
    public int[] maxSumSortArray(int[] number, int target){
        int ans[] = new int[2];
        int start = 0;
        int end = number.length - 1;
        while(start < end){
            int sum = number[start] + number[end];
            if(sum == target){
                ans[0] = start + 1;
                ans[1] = end + 1;
            }else if(sum < end){
                sum++;
            }else{
                end--;
            }
        }
        return ans;
    }    
    public static void main(String[] args) {
        SortedMaxSum sortedMaxSum = new SortedMaxSum();
        int[] number = {1, 2, 3, 4, 5};
        int target = 6;
        int[] result = sortedMaxSum.maxSumSortArray(number, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
