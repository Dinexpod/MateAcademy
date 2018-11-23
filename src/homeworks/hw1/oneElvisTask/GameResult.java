package homeworks.hw1.oneElvisTask;

public class GameResult {

    public static int result(int score1, int score2, int setScore1, int setScore2) {
        return ((score1 == setScore1) && (score2 == setScore2))
                ? 2
                : (((score1 < score2) && (setScore1 < setScore2))
                    || ((score1 > score2) && (setScore1 > setScore2))
                    || ((score1 == score2) && (setScore1 == setScore2))
                    ? 1
                    : 0 );
    }
}
