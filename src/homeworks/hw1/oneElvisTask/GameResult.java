package homeworks.hw1.oneElvisTask;

public class GameResult {
    /*
     * method that gets commands score: (actualScore1:actualScore2),
     * and expected score: (expectedScore1:expectedScore2)
     */
    public static int result(int actualScore1, int actualScore2, int expectedScore1, int expectedScore2) {
        return ((actualScore1 == expectedScore1) && (actualScore2 == expectedScore2))
                ? 2
                : (((actualScore1 < actualScore2) && (expectedScore1 < expectedScore2))
                    || ((actualScore1 > actualScore2) && (expectedScore1 > expectedScore2))
                    || ((actualScore1 == actualScore2) && (expectedScore1 == expectedScore2))
                    ? 1
                    : 0 );
    }
}
