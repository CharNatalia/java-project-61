package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User user = new User();

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");

        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input");
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
                Cli.sayHi(user);
                Even.game(user);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }


    }
}
