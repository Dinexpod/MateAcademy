package homeworks.hw1.threeRomb;

public class RombRealization {
    public static void rombRealization(int sizeDiagonal) {
        String[][] tmp = new String[sizeDiagonal][sizeDiagonal];

        for (int i = 0; i < sizeDiagonal; i++) {
            for (int j = 0; j < sizeDiagonal; j++) {
                if(j > sizeDiagonal/2) {
                    tmp[i][j] = " ";
                } else {
                    tmp[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[i][j]);
            }
            System.out.println();
        }
    }
}
