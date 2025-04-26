package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Prime {
    public static void play(User user) {
        Random random = new Random();

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[2][3];

        for (var i = 0; i < questionsAndAnswers[0].length; i++) {
            int randomNum = random.nextInt(100);

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
        return num == 1 ? "no" : "yes";
    }
}
