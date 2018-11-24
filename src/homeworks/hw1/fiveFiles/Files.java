package homeworks.hw1.fiveFiles;

import homeworks.hw1.twoMatrix.MatrixRevers;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        int[][] actualMatrix = {  {0, 1, 2, 3, 4},
                                 {5, 6, 7, 8, 9},
                                 {10, 11, 12, 13, 14},
                                 {15, 16, 17, 18, 19},
                                 {20, 21, 22, 23, 24} };

        int[][] reversMatrix = MatrixRevers.reverse(actualMatrix);

        // writing the matrix to file
        try(FileWriter writer = new FileWriter("src/homeworks/hw1/fiveFiles/reflected_matrix.txt", false)) {
            for (int i = 0; i < reversMatrix.length; i++) {
                for (int j = 0; j < reversMatrix[i].length; j++) {
                    writer.write(reversMatrix[i][j] + "\t");
                }
                writer.write("\n");
            }

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
