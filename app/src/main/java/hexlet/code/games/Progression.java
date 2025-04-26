package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Progression {
    public static void play(User user) {
        Random random = new Random();

        String rules = "What number is missing in the progression?";

        int minLengthProgression = 5;
        int maxLengthProgression = 11;

        int rowLength = 2;
        int columnLength = 3;
        String[][] questionsAndAnswers = new String[rowLength][columnLength];

        int maxNumberRange = 101;

        for (var i = 0; i < columnLength; i++) {
            int progressionLength = random.nextInt(minLengthProgression, maxLengthProgression);

            int hiddenNumIndex = random.nextInt(progressionLength);

            int firstElement = random.nextInt(maxNumberRange);
            int d = random.nextInt(maxNumberRange);

            if (hiddenNumIndex == 0) {
                questionsAndAnswers[1][i] = Integer.toString(firstElement);
                questionsAndAnswers[0][i] = ".. ";
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
