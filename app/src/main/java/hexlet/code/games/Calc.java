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
            var tmp = 0;
            for (var oneRound : generateRoundData(operators)) {
                questionsAndAnswers[tmp][i] = oneRound;
                tmp++;
            }
        }
        Engine.answerCheck(questionsAndAnswers, rules);
    }

    public static String[] generateRoundData(char[] operators) {
        String[] oneRoundData = new String[2];
        int randomNum1 = Utils.getRandomNum();
        int randomNum2 = Utils.getRandomNum();
        char randomOperator = operators[Utils.getRandomNum(0, operators.length)];

        oneRoundData[0] = String.format("%d %c %d", randomNum1, randomOperator, randomNum2);
        oneRoundData[1] = Integer.toString(getCalculated(randomNum1, randomNum2, randomOperator));
        return oneRoundData;
    }

    public static int getCalculated(int randomNum1, int randomNum2, char operator) {
        return switch (operator) {
            case '+' -> randomNum1 + randomNum2;
            case '*' -> randomNum1 * randomNum2;
            case '-' -> randomNum1 - randomNum2;
            default -> throw new UnsupportedOperationException(
                    String.format("Operation %c is not supported", operator)
            );
        };
    }
}
