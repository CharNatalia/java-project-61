package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static final int COUNT_ELEMENTS_IN_ROUND = 2;
    public static final int ROUNDS_COUNT = 3;

    public static void enginePlay(String[][] roundsData, String rules) {
        String username = Cli.greet();
        System.out.println(rules);

        for (String[] oneRoundData : roundsData) {
            var question = oneRoundData[0];
            var rightAnswer = oneRoundData[1];

            System.out.println("Question: " + question);
            var newAnswer = SCANNER.nextLine();

            if (newAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", newAnswer, rightAnswer, username);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", username);
    }
}
