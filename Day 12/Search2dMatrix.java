public class Search2dMatrix {
    public boolean checkElement(int[][] mat, int target){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Search2dMatrix sm = new Search2dMatrix();
        sm.checkElement(new int[][]{{1, 2, 3},{4, 3, 2, 1},{3, 2, 1, 4}}, 4);
    }
}
