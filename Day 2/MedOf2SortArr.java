public class MedOf2SortArr {
    public int medianOfTwoSortedArrays(int[] numbers1, int[] numbers2) {
        int [] ans = mergeAndSort(numbers1, numbers2);
        int n1 = ans.length;
        if(n1%2 == 0){
            return (ans[n1/2 - 1] + ans[n1/2]) / 2;
        }else{
            return ans[n1/2];
        }
        
    }
    public int[] mergeAndSort(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length || j < arr2.length){
            int val1 = i < arr1.length ? arr1[i] : Integer.MAX_VALUE;
            int val2 = j < arr2.length ? arr2[j] : Integer.MAX_VALUE;

            if(val1 < val2){
                res[k] = val1;
                i++;
            }else{
                res[k] = val2;
                j++;
            }
            k++;
        }
        return res;
    }
    public static void main(String[] args) {
        MedOf2SortArr med = new MedOf2SortArr();
        int[] numbers1 = {1, 3};
        int[] numbers2 = {2};
        int median = med.medianOfTwoSortedArrays(numbers1, numbers2);
        System.out.println("Median of the two sorted arrays is: " + median);
    }
}
