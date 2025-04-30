package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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
