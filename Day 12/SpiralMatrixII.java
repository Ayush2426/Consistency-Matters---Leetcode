public class SpiralMatrixII {
    public int[][] getSpiralMatrix(int n){
        int[][] arr = new int[n][n];

        int count = 1;
        int minRow = 0, minCol = 0;
        int maxRow = n - 1, maxCol = n - 1;

        while(count <= n*n){

            for(int i = minCol; i <= maxCol; i++){
                arr[minRow][i] = count;
                count++;
            }

            for(int j = minRow + 1; j <= maxRow; j++ ){
                arr[j][minCol] = count;
                count++;
            }

            for(int i = maxCol - 1; i >= minCol; i++){
                arr[maxRow][i] = count;
                count++;
            }

            for(int j = maxRow - 1; j >= minRow + 1; j--){
                arr[j][minCol] = count;
                count++;
            }

            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
        }
        return arr;
    }
    public static void main(String[] args) {
        SpiralMatrixII smii = new SpiralMatrixII();
        smii.getSpiralMatrix(4);
    }
}
