package homeworks.hw1.twoMatrix;

public class MatrixRevers {
    /*
     * Reversion matrix about the main diagonal
     */
    public static int[][] reverse(int[][] matrix){
        int[][] tmpMatrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                tmpMatrix[j][i] = matrix[i][j];
            }
        }
        return tmpMatrix;
    }
}
