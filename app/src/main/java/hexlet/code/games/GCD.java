package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

public class GCD {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play(User user) {
        String rules = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];

        for (var i = 0; i < COLUMN_LENGTH; i++) {
            int randomNum1 = Engine.getRandomNum();
            int randomNum2 = Engine.getRandomNum();

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
