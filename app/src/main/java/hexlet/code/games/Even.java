package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Even {
    private static final int MAX_NUMBER_RANGE = 101;
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static void play(User user) {
        Random random = new Random();

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";


        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];


        for (var i = 0; i < COLUMN_LENGTH; i++) {
            int randomNum = random.nextInt(MAX_NUMBER_RANGE);

            questionsAndAnswers[0][i] = String.format("%d", randomNum);
            questionsAndAnswers[1][i] = getRightAnswer(randomNum);
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }

    public static String getRightAnswer(int num) {
        if (num % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
