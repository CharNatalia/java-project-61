package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
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
                0 - Exit""");

        var choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input");
            System.exit(0);
        }

        switch (choice) {
            case 0:
                System.out.println("Your choice: " + choice);
                break;
            case 1:
                System.out.println("Your choice: " + choice);
                Cli.sayHi(user);
                break;
            case 2:
                System.out.println("Your choice: " + choice);
                Even.game(user);
                break;
            case 3:
                System.out.println("Your choice: " + choice);
                Calc.game(user);
                break;
            case 4:
                System.out.println("Your choice: " + choice);
                GCD.game(user);
                break;
            case 5:
                System.out.println("Your choice: " + choice);
                Progression.game(user);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }


    }
}
