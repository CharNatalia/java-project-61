package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static final int MIN_LENGTH_PROGRESSION = 5;
    public static final int MAX_LENGTH_PROGRESSION = 11;

    public static void play() {
        String rules = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];

        for (var i = 0; i < COLUMN_LENGTH; i++) {
            var tmp = 0;
            for (var oneRound : generateRoundData()) {
                questionsAndAnswers[tmp][i] = oneRound;
                tmp++;
            }
        }
        Engine.answerCheck(questionsAndAnswers, rules);
    }

    public static String[] generateRoundData() {
        String[] oneRoundData = new String[2];

        int progressionLength = Utils.getRandomNum(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
        int hiddenNumIndex = Utils.getRandomNum(0, progressionLength);
        int firstElement = Utils.getRandomNum();
        int d = Utils.getRandomNum();

        int hiddenElement = firstElement + d * (hiddenNumIndex + 1);

        String progressionString = "";
        for (var element : generateProgression(progressionLength, firstElement, d)) {
            if (element == hiddenElement) {
                progressionString += ".. ";
            } else {
                progressionString += String.format("%d ", element);
            }
        }
        oneRoundData[0] = progressionString;
        oneRoundData[1] = Integer.toString(hiddenElement);
        return oneRoundData;
    }

    public static int[] generateProgression(int progressionLength, int firstElement, int d) {
        int[] progression = new int[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = firstElement + d * (i + 1);
        }
        return progression;
    }
}
