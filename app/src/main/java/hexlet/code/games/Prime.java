package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

public class Prime {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play(User user) {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];

        for (var i = 0; i < COLUMN_LENGTH; i++) {
            int randomNum = Engine.getRandomNum();

            questionsAndAnswers[0][i] = String.format("%d", randomNum);
            questionsAndAnswers[1][i] = getRightAnswer(randomNum);
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }

    public static String getRightAnswer(int num) {
        for (var i = 2; i < num; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return num <= 1 ? "no" : "yes";
    }
}
