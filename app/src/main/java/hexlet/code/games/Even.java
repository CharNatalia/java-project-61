package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Even {

    public static void play(User user) {
        Random random = new Random();

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int rowLength = 2;
        int columnLength = 3;
        String[][] questionsAndAnswers = new String[rowLength][columnLength];

        int maxNumberRange = 101;

        for (var i = 0; i < columnLength; i++) {
            int randomNum = random.nextInt(maxNumberRange);

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
