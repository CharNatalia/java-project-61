package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

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

        oneRoundData[0] = String.format("%d %d", randomNum1, randomNum2);
        oneRoundData[1] = Integer.toString(calculateGTD(randomNum1, randomNum2));
        return oneRoundData;
    }

    public static int calculateGTD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1 + num2;
    }
}
