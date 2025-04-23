package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void game(User user) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var flag = 0;
        var answerIsRight = true;

        while (flag != 3 && answerIsRight) {
            int randomNum = getRandomNum();
            System.out.println("Question: " + randomNum);

            Scanner scanner = new Scanner(System.in);
            String newAnswer = scanner.nextLine();

            String rightAnswer = isEven(randomNum);

            if (newAnswer.equals(rightAnswer)) {
                flag++;
                System.out.println("Correct!");
            } else {
                answerIsRight = false;
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!%n", newAnswer, rightAnswer, user.getName());
            }
        }
        if (flag == 3) {
            System.out.printf("Congratulations, %s!", user.getName());
        }
    }

    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static String isEven(int num) {
        var answer = "no";
        if (num % 2 == 0) {
            answer = "yes";
        }
        return answer;
    }
}
