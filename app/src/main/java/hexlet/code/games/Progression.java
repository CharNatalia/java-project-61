package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final int MIN_LENGTH_PROGRESSION = 5;
    public static final int MAX_LENGTH_PROGRESSION = 11;

    public static final String RULES = "What number is missing in the progression?";

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.COUNT_ELEMENTS_IN_ROUND];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.enginePlay(questionsAndAnswers, RULES);
    }

    public static String[] generateRoundData() {
        String[] oneRoundData = new String[2];

        int progressionLength = Utils.generateRandomNumber(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
        int firstElement = Utils.generateRandomNumber();
        int step = Utils.generateRandomNumber();

        int hiddenNumberIndex = Utils.generateRandomNumber(0, progressionLength);

        String[] progression = generateProgression(progressionLength, firstElement, step);

        oneRoundData[1] = progression[hiddenNumberIndex];
        progression[hiddenNumberIndex] = "..";
        oneRoundData[0] = String.join(" ", progression);

        return oneRoundData;
    }

    public static String[] generateProgression(int progressionLength, int firstElement, int step) {
        String[] progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(firstElement + step * (i + 1));
        }
        return progression;
    }
}
