package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class GCD {
    public static void game(User user) {
        Random random = new Random();

        String rules = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = new String[2][3];

        for (var i = 0; i < questionsAndAnswers[0].length; i++) {
            int randomNum1 = random.nextInt(100);
            int randomNum2 = random.nextInt(100);

            questionsAndAnswers[0][i] = String.format("%d %d", randomNum1, randomNum2);
            questionsAndAnswers[1][i] = isGCD(randomNum1, randomNum2);
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }

    public static String isGCD(int num1, int num2) {
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
