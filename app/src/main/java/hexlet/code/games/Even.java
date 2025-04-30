package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

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
        int randomNum = Utils.getRandomNum();

        oneRoundData[0] = String.format("%d", randomNum);
        oneRoundData[1] = isEven(randomNum) ? "yes" : "no";
        return oneRoundData;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
