public class MatrixDiagonalSum {
    public int diagonalSUm(int[][] mat) {

        int dSum = 0;

        if (mat.length == 1) {
            return mat[0][0];
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    dSum += mat[i][j];
                }
            }
        }
        return dSum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum mds = new MatrixDiagonalSum();
        mds.diagonalSUm(new int[][]{{1, 2, 3},{1, 2, 3,},{1, 2, 3}});
    }
}
