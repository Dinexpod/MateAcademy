package homeworks.hw1.twoMatrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] actualMatrix = {  {0, 1, 2, 3, 4},
                                  {5, 6, 7, 8, 9},
                                  {10, 11, 12, 13, 14},
                                  {15, 16, 17, 18, 19},
                                  {20, 21, 22, 23, 24} };

        int[][] reversedMatrix = MatrixRevers.reverse(actualMatrix);

        System.out.println("\nActual matrix:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(actualMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nReversed matrix:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(reversedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
