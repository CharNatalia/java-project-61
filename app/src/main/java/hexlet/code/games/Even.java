package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

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

        oneRoundData[0] = Integer.toString(randomNum);
        oneRoundData[1] = isEven(randomNum) ? "yes" : "no";
        return oneRoundData;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
