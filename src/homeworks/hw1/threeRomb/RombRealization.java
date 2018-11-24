package homeworks.hw1.threeRomb;

public class RombRealization {
   /*
    * Method that make realization a romb by "*"
    */
    public static void rombRealization(int sizeDiagonal) {
        if((sizeDiagonal % 2) == 1) {
            for (int i = 0; i < sizeDiagonal; i++) {
                for (int j = 0; j < sizeDiagonal; j++) {
                    if ((j < ((sizeDiagonal / 2)) - i) || (j > ((sizeDiagonal / 2) + i))) {
                        System.out.print(" ");
                    } else if ((i > (sizeDiagonal / 2))
                            && ((j < ((sizeDiagonal / 2) + 1) - (sizeDiagonal - i))
                            || (j > (((sizeDiagonal / 2) - 1) + (sizeDiagonal - i))))) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("You inputed a paired number!");
        }
    }
}
