package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean answerCheck(String rightAnswer, String newAnswer, User user) {
        if (newAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!%n", newAnswer, rightAnswer, user.getName());
            return false;
        }
    }

    public static String askQuestion(String question) {
        System.out.println("Question: " + question);
        return scanner.nextLine();
    }

    public static void isWinner(User user, int victoryCounter) {
        if (victoryCounter == 3) {
            System.out.printf("Congratulations, %s!%n", user.getName());
        }
    }
}
