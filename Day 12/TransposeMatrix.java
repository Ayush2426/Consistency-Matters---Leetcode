public class TransposeMatrix {
    public int[][] getTransposeMatrix(int[][] mat){

        int cols = mat[0].length;
        int rows = mat.length;
        int[][] arr = new int[cols][rows];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                arr[j][i] = mat[i][j];
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        tm.getTransposeMatrix(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}});
    }
}
