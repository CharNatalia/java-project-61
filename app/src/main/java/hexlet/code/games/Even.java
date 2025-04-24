package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Even {

    public static void game(User user) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        var victoryCounter = 0;
        var answerIsRight = true;

        while (victoryCounter != 3 && answerIsRight) {
            int randomNum = random.nextInt(100);

            String newAnswer = Engine.askQuestion(Integer.toString(randomNum));

            String rightAnswer = isEven(randomNum);

            answerIsRight = Engine.answerCheck(rightAnswer, newAnswer, user);

            victoryCounter++;
        }
        Engine.isWinner(user, answerIsRight);
    }

    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
