package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.User;

import java.util.Random;

public class Calc {
    public static void game(User user) {
        System.out.println("What is the result of the expression?");

        Random random = new Random();
        char[] operators = {'+', '*', '-'};

        var victoryCounter = 0;
        var answerIsRight = true;

        while (victoryCounter != 3 && answerIsRight) {
            int randomNum1 = random.nextInt(100);
            int randomNum2 = random.nextInt(100);
            char randomOperator = operators[random.nextInt(operators.length)];

            String newAnswer = Engine.askQuestion(String.format("%d %c %d", randomNum1, randomOperator, randomNum2));

            int rightAnswer = calcResult(randomNum1, randomNum2, randomOperator);

            answerIsRight = Engine.answerCheck(Integer.toString(rightAnswer), newAnswer, user);

            victoryCounter++;
        }
        Engine.isWinner(user, answerIsRight);
    }

    public static int calcResult(int randomNum1, int randomNum2, char operator) {
        return switch (operator) {
            case '+' -> randomNum1 + randomNum2;
            case '*' -> randomNum1 * randomNum2;
            case '-' -> randomNum1 - randomNum2;
            default -> throw new UnsupportedOperationException(String.format("Operation %c is not supported", operator));
        };
    }
}
