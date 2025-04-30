package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void answerCheck(String[][] qAndA, String rules) {
        String username = Cli.greet();

        System.out.println(rules);

        var i = 0;
        for (var question : qAndA[0]) {
            System.out.println("Question: " + question);
            var newAnswer = SCANNER.nextLine();

            if (newAnswer.equals(qAndA[1][i])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", newAnswer, qAndA[1][i], username);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", username);
    }

}
