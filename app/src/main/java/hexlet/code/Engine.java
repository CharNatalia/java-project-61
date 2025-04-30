package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void answerCheck(String[][] qAndA, String rules) {
        String username = Cli.greet();

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
                        + "Let's try again, %s!%n", newAnswer, qAndA[1][i], username);
                answerIsRight = false;
            }
        }
        if (answerIsRight) {
            System.out.printf("Congratulations, %s!%n", username);
        }
    }

    public static String askQuestion(String question) {
        System.out.println("Question: " + question);
        return SCANNER.nextLine();
    }
}
