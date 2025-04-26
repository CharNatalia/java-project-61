package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
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
            case 0:
                System.out.println(userChoice);
                break;
            case 1:
                System.out.println(userChoice);
                Cli.sayHi(user);
                break;
            case 2:
                System.out.println(userChoice);
                Even.play(user);
                break;
            case 3:
                System.out.println(userChoice);
                Calc.play(user);
                break;
            case 4:
                System.out.println(userChoice);
                GCD.play(user);
                break;
            case 5:
                System.out.println(userChoice);
                Progression.play(user);
                break;
            case 6:
                System.out.println(userChoice);
                Prime.play(user);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }


    }
}
