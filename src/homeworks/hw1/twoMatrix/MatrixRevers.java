package homeworks.hw1.twoMatrix;

public class MatrixRevers {
    public static int[][] reverse(int[][] matrix){
        int[][] mRevers = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mRevers[j][i] = matrix[i][j];
            }
        }
        return mRevers;
    }
}
