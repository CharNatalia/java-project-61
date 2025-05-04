package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.COUNT_ELEMENTS_IN_ROUND];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.enginePlay(questionsAndAnswers, RULES);
    }

    public static String[] generateRoundData() {
        String[] oneRoundData = new String[2];
        int randomNum = Utils.generateRandomNumber();

        oneRoundData[0] = String.format("%d", randomNum);
        oneRoundData[1] = isPrime(randomNum) ? "yes" : "no";
        return oneRoundData;
    }

    public static boolean isPrime(int num) {
        for (var i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
}
