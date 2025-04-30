package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play() {
        String rules = "What is the result of the expression?";

        char[] operators = {'+', '*', '-'};

        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];

        for (var i = 0; i < COLUMN_LENGTH; i++) {
            int randomNum1 = Utils.getRandomNum();
            int randomNum2 = Utils.getRandomNum();
            char randomOperator = operators[Utils.getRandomNum(0, operators.length)];

            questionsAndAnswers[0][i] = String.format("%d %c %d", randomNum1, randomOperator, randomNum2);
            questionsAndAnswers[1][i] = getRightAnswer(randomNum1, randomNum2, randomOperator);
        }
        Engine.answerCheck(questionsAndAnswers, rules);
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
