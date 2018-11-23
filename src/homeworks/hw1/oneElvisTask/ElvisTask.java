package homeworks.hw1.oneElvisTask;

public class ElvisTask {
    public static void main(String[] args) {
        int score1, score2;

        score1 = 2; //(int) (Math.random()*11);
        score2 = 1; //(int) (Math.random()*11);

        int resultVangas = GameResult.result(score1, score2, 3, 2);

        System.out.println("Commands score: " + score1 + ":" + score2);

        System.out.println(resultVangas);





    }
}
