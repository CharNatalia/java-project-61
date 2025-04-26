package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Even {

    public static void play(User user) {
        Random random = new Random();

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[2][3];

        for (var i = 0; i < questionsAndAnswers[0].length; i++) {
            int randomNum = random.nextInt(100);

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
