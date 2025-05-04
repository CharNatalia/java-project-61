package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final char[] OPERATORS = {'+', '*', '-'};
    private static final String RULES = "What is the result of the expression?";

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.COUNT_ELEMENTS_IN_ROUND];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.enginePlay(questionsAndAnswers, RULES);
    }

    public static String[] generateRoundData() {
        String[] oneRoundData = new String[2];
        int randomNum1 = Utils.generateRandomNumber();
        int randomNum2 = Utils.generateRandomNumber();
        char randomOperator = OPERATORS[Utils.generateRandomNumber(0, OPERATORS.length)];

        oneRoundData[0] = String.format("%d %c %d", randomNum1, randomOperator, randomNum2);
        oneRoundData[1] = Integer.toString(calculateResult(randomNum1, randomNum2, randomOperator));
        return oneRoundData;
    }

    public static int calculateResult(int randomNum1, int randomNum2, char operator) {
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
