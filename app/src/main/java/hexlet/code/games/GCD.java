package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class GCD {
    public static void play(User user) {
        Random random = new Random();

        String rules = "Find the greatest common divisor of given numbers.";

        int rowLength = 2;
        int columnLength = 3;
        String[][] questionsAndAnswers = new String[rowLength][columnLength];

        int maxNumberRange = 101;

        for (var i = 0; i < columnLength; i++) {
            int randomNum1 = random.nextInt(maxNumberRange);
            int randomNum2 = random.nextInt(maxNumberRange);

            questionsAndAnswers[0][i] = String.format("%d %d", randomNum1, randomNum2);
            questionsAndAnswers[1][i] = getRightAnswer(randomNum1, randomNum2);
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }

    public static String getRightAnswer(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return Integer.toString(num1 + num2);
    }
}
