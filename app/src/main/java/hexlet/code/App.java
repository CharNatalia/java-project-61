package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        User user = new User();

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        var choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input");
            System.exit(0);
        }

        String userChoice = "Your choice: " + choice;

        switch (choice) {
            case EXIT:
                System.out.println(userChoice);
                break;
            case GREET:
                System.out.println(userChoice);
                Cli.sayHi(user);
                break;
            case EVEN_GAME:
                System.out.println(userChoice);
                Even.play(user);
                break;
            case CALC_GAME:
                System.out.println(userChoice);
                Calc.play(user);
                break;
            case GCD_GAME:
                System.out.println(userChoice);
                GCD.play(user);
                break;
            case PROGRESSION_GAME:
                System.out.println(userChoice);
                Progression.play(user);
                break;
            case PRIME_GAME:
                System.out.println(userChoice);
                Prime.play(user);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }


    }
}
