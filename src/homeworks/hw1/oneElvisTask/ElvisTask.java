package homeworks.hw1.oneElvisTask;

public class ElvisTask {
    public static void main(String[] args) {
        int score1, score2;

        score1 = 2; //(int) (Math.random()*11);
        score2 = 1; //(int) (Math.random()*11);

        // Метод який приймає рахунок команди: (score1:score2), та ставку спостерігача: (setScore1:setScore2)
        int resultVangas = GameResult.result(score1, score2, 3, 2);

        System.out.println("Результат команди: " + score1 + ":" + score2);

        System.out.println(resultVangas);





    }
}
