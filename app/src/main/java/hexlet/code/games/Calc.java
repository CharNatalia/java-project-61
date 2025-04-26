package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Calc {
    public static void play(User user) {
        Random random = new Random();

        String rules = "What is the result of the expression?";

        char[] operators = {'+', '*', '-'};
        String[][] questionsAndAnswers = new String[2][3];

        for (var i = 0; i < questionsAndAnswers[0].length; i++) {
            int randomNum1 = random.nextInt(100);
            int randomNum2 = random.nextInt(100);
            char randomOperator = operators[random.nextInt(operators.length)];

            questionsAndAnswers[0][i] = String.format("%d %c %d", randomNum1, randomOperator, randomNum2);
            questionsAndAnswers[1][i] = getRightAnswer(randomNum1, randomNum2, randomOperator);
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }

    public static String getRightAnswer(int randomNum1, int randomNum2, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(randomNum1 + randomNum2);
            case '*' -> Integer.toString(randomNum1 * randomNum2);
            case '-' -> Integer.toString(randomNum1 - randomNum2);
            default -> throw new UnsupportedOperationException(
                    String.format("Operation %c is not supported", operator)
            );
        };
    }
}
