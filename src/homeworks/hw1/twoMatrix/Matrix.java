package homeworks.hw1.twoMatrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {  {0, 1, 2, 3, 4},
                            {5, 6, 7, 8, 9},
                            {10, 11, 12, 13, 14},
                            {15, 16, 17, 18, 19},
                            {20, 21, 22, 23, 24} };

        int[][] matrixReverse = MatrixRevers.reverse(matrix);  // Реверс матриці відносно головної діагоналі

        // Вивід початкової матриці
        System.out.println("\nВихідна матриця:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Вивід оберненої матриці
        System.out.println("\nОбернена матриця:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrixReverse[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
