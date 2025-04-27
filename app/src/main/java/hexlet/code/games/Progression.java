package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

public class Progression {
    private static final int ROW_LENGTH = 2;
    private static final int COLUMN_LENGTH = 3;

    public static final int MIN_LENGTH_PROGRESSION = 5;
    public static final int MAX_LENGTH_PROGRESSION = 11;

    public static void play(User user) {
        String rules = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[ROW_LENGTH][COLUMN_LENGTH];

        for (var i = 0; i < COLUMN_LENGTH; i++) {
            int progressionLength = Engine.getRandomNum(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);

            int hiddenNumIndex = Engine.getRandomNum(0, progressionLength);

            int firstElement = Engine.getRandomNum();
            int d = Engine.getRandomNum();

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
