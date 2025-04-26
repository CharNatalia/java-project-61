package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Progression {
    public static void play(User user) {
        Random random = new Random();

        String rules = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[2][3];

        for (var i = 0; i < questionsAndAnswers[0].length; i++) {
            int progressionLength = random.nextInt(5, 11);

            int hiddenNumIndex = random.nextInt(progressionLength);

            int firstElement = random.nextInt(101);
            int d = random.nextInt(101);

            if (hiddenNumIndex == 0) {
                questionsAndAnswers[1][i] = Integer.toString(firstElement);
                questionsAndAnswers[0][i] += ".. ";
            } else {
                questionsAndAnswers[0][i] = firstElement + " ";
            }

            for (var j = 1; j < progressionLength; j++) {
                int currentElement = firstElement + d * j;
                if (hiddenNumIndex == j) {
                    questionsAndAnswers[1][i] = Integer.toString(currentElement);
                    questionsAndAnswers[0][i] += ".. ";
                } else {
                    questionsAndAnswers[0][i] += currentElement + " ";
                }
            }
        }
        Engine.answerCheck(user, questionsAndAnswers, rules);
    }
}
