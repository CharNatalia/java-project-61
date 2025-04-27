package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER_RANGE = 101;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getRandomNum(int origin, int bound) {
        return RANDOM.nextInt(origin, bound);
    }

    public static int getRandomNum() {
        return RANDOM.nextInt(MAX_NUMBER_RANGE);
    }

    public static void answerCheck(User user, String[][] qAndA, String rules) {
        Cli.sayHi(user);

        System.out.println(rules);

        var answerIsRight = true;
        var i = 0;

        while (i <= qAndA.length && answerIsRight) {

            var newAnswer = askQuestion(qAndA[0][i]);

            if (newAnswer.equals(qAndA[1][i])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", newAnswer, qAndA[1][i], user.getName());
                answerIsRight = false;
            }
        }
        if (answerIsRight) {
            System.out.printf("Congratulations, %s!%n", user.getName());
        }
    }

    public static String askQuestion(String question) {
        System.out.println("Question: " + question);
        return SCANNER.nextLine();
    }
}
